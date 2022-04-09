import java.util.Scanner;

public class Rensyuu8_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "番目の値");
            values[i] = Integer.parseInt(scan.nextLine());
        }
        int[] result = bubble_sort(values);
        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.println();
        scan.close();
    }

    public static int[] bubble_sort(int[] source) {
        int[] result = source.clone();
        for (int i = 0; i < result.length; i++) {
            boolean swapped = false;
            for (int j = result.length - 1; j > i; j--) {
                if (result[j] < result[j - 1]) {
                    swapped = true;
                    int temp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = temp;
                }
            }
            if (!swapped) break;
        }
        return result;
    }
}
