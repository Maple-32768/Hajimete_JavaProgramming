import java.util.Scanner;

public class Rensyuu7_4 {
    //1/2 * n * (n + 1) <= x
    // n <= 1/2 * (sqrt(8x + 1) - 1)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("整数x");
        x = Integer.parseInt(scan.nextLine());
        System.out.println("nの最大値 : " + (int) ((Math.sqrt(8 * x + 1) - 1) / 2));
        scan.close();
    }
}
