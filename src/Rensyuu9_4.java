public class Rensyuu9_4 {
    private static final int[][] a = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    //det(E) = 1

    public static void main(String[] args) {
        System.out.println(determinant3(a) == 1 ? "当たり" : "はずれ");
    }

    public static int determinant3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) throw new IllegalArgumentException();
        int det = 0;
        for (int i = 0; i < 3; i++) {
            int temp1 = 1, temp2 = 1;
            for (int j = 0; j < 3; j++) {
                temp1 *= matrix[j][(i + j) % 3];
                temp2 *= matrix[j][(i - j + 3) % 3];
            }
            det += temp1 - temp2;
        }
        return det;
    }
}
