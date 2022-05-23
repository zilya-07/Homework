//Product of consecutive Fib numbers
public class ProdFib {
    public static long[] productFib(long prod) {
        long prev = 0, current = 1;
        do {
            long time = current;
            current += prev;
            prev = time;

        } while (current * prev < prod);
        return new long[]{prev, current, (current * prev == prod) ? 1 : 0};
    }
}
