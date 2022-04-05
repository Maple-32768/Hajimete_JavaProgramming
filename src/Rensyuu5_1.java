import java.util.Scanner;

public class Rensyuu5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("基数n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("指数m");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("n ^ m = " + pow(n, m));
        scan.close();
    }

    public static int pow(int a, int b) {
        return b == 1 ? a : a * pow(a, b - 1);
    }
}
