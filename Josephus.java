//Josephus Permutation
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        int toRemove = 0;
        while (items.size() > 0) {
            toRemove = (toRemove + k - 1) % items.size();
            result.add(items.remove(toRemove));
        }
        return result;
    }
}
