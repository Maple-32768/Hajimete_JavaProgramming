import java.util.Scanner;

public class Rensyuu13_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, n;
        System.out.println("x");
        x = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("x ^ n = " + pow(x, n));
        scan.close();
    }

    public static int pow(int a, int b) {
        return b == 1 ? a : a * pow(a, b - 1);
    }
}
