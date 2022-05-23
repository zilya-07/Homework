//weight sort
public class WeightSort {
    public static String orderWeight(String strng) {
        return Arrays.stream(strng.split("\\s+"))
                .sorted(Comparator
                        .comparing(WeightSort::sumOfDigits)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));
    }

    public static int sumOfDigits(String str) {
        return str.chars().map(c -> c - 48).sum();
    }
}
