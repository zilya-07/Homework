//Simple assembler interpreter
public class SimpleAssembler {
    public static Map<String, Integer> interpret(String[] program) {
        Map<String, Integer> registers = new HashMap<>();
        for (int i = 0; i < program.length; i++) {
            String[] instructions = program[i].split(" ");
            switch (instructions[0]) {
                case "mov" -> {
                    if (instructions[2].matches("\\-?\\d+")) {
                        registers.put(instructions[1], Integer.parseInt(instructions[2]));
                    } else {
                        registers.put(instructions[1], registers.get(instructions[2]));
                    }
                }
                case "inc" -> {
                    registers.put(instructions[1], registers.get(instructions[1]) + 1);
                }
                case "dec" -> {
                    registers.put(instructions[1], registers.get(instructions[1]) - 1);
                }
                case "jnz" -> {
                    if (!registers.containsKey(instructions[1]) || registers.get(instructions[1]) != 0) {
                        i += Integer.parseInt(instructions[2]) - 1;
                    }
                }
            }
        }
        return registers;
    }
}