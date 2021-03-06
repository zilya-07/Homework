//Is my friend cheating?
public class RemovedNumbers {
    public static List<long[]> removNb(long n) {
        long sum = n * (n + 1) / 2;
        List<long[]> list = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            long j = (sum - i) / (i + 1);
            if (j < n && i * j == sum - i - j) {
                list.add(new long[]{i, j});
            }
        }
        return list;
    }
}