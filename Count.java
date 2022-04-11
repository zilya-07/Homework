//Count the Digit
//Берем целое число n (n >= 0) а цифра d (0 <= d <= 9) как целое число.
//
//        Квадрат всех чисел k (0 <= k <= n) между 0 и n.
//
  //      Подсчитайте количество цифр d используется при написании всех k**2.
//
  //      назовите nb_dig (или nbDig или ...) функция, принимающая n и d в качестве параметров и возвращает этот счетчик.
public class CountDig {

    public static int nbDig(int n, int d) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += countOfDigit((int) Math.pow(i, 2), d);
        }
        return sum;
    }

    public static int countOfDigit(int n, int d) {
        int count = 0;
        do {
            if (n % 10 == d)
                count ++;
            n /= 10;
        } while (n > 0);
        return count;
    }
}