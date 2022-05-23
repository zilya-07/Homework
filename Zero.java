//Number of trailing zeros of N!
public class Solution {
    public static int zeros(int n) {
        return getSum(n, 1);
    }

    public static int getSum(int n, int pow) {
        int nextNum = (int) Math.pow(5, pow);
        if (nextNum > n) {
            return 0;
        }
        return (n / nextNum) + getSum(n, ++pow);
    }
}
