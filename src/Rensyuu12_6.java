import java.util.Scanner;

public class Rensyuu12_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数の個数");
        int n = Integer.parseInt(scan.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"番目の整数");
            array[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("最大値は" + maxArray(array));
        scan.close();
    }

    public static int maxArray(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i : array) max = Math.max(max, i);
        return max;
    }
}
