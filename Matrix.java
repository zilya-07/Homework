//Square Matrix Multiplication
public class Kata {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (a == null || b == null || a[0].length != b.length) {
            return null;
        }
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                for (int k = 0; k < b.length; ++k) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
