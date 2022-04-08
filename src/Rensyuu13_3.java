import java.util.Scanner;

public class Rensyuu13_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.println("m");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("m * n = " + multiply(m, n));
        scan.close();
    }

    public static int multiply(int a, int b) {
        return a == 1 ? b : b + multiply(a - 1, b);
    }
}
