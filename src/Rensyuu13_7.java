import java.util.Scanner;

public class Rensyuu13_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.println("m");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("gcd(m, n) = " + gcd(m, n));
        scan.close();
    }

    public static int gcd(int a, int b) {
        return a == b ? a : a > b ? gcd(a - b, b) : gcd(a, b - a);
    }
}
