//Convert number to reversed array of digits
//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
public class Kata {
    public static int[] digitize(long n) {
        StringBuilder st = new StringBuilder(String.valueOf(n));
        String newST[] = st.reverse().toString().split("");
        int arrInt [] = new int[newST.length];
        for(int i = 0; i < newST.length; i++) {
            arrInt[i] = Integer.parseInt(newST[i]);
        }
        return arrInt;
    }
}