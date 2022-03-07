//Don't give me 5
//В этом ката вы получаете начальный номер и
// конечный номер региона и должны вернуть количество всех чисел, кроме чисел с 5 в нем. Начальный и конечный номер включены!
public class Five {
    public class Kata
    {
        public static int dontGiveMeFive(int start, int end) {
            int count = 0;
            for (int i = start; i <= end; i++)
                count += containsFive(i)?0:1;
            return count;
        }

        private static boolean containsFive(int i) {
            return String.valueOf(i).contains("5");
        }
    }
}
