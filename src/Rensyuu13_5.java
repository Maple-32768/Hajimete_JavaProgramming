import java.util.Scanner;

public class Rensyuu13_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.println("m");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("ack(m, n) = " + ack(m, n));
        scan.close();
    }

    public static int ack(int m, int n) {
        return m == 0 ? n + 1 : m > 0 && n == 0 ? ack(m - 1, 1) : ack(m - 1, ack(m, n - 1));
    }
}
