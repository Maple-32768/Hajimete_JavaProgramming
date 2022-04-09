import java.util.Scanner;

public class Rensyuu9_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a" + (i + 1) + (j + 1));
                a[i][j] = Integer.parseInt(scan.nextLine());
            }
        }

        System.out.println(determinant3(a));
        scan.close();
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
