//Persistent Bugger
class Persist {

    public static long multiplyDigits(long n) {
        long multiply = 1;
        while (n > 0) {
            multiply *= n % 10;
            n /= 10;
        }
        return multiply;
    }

    public static int persistence(long n) {
        int count = 0;
        while (n > 9) {
            count++;
            n = multiplyDigits(n);
        }
        return count;
    }

}