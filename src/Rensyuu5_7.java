import java.util.Scanner;

public class Rensyuu5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("整数n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("整数m");
        m = Integer.parseInt(scan.nextLine());
        for (int i = Math.max(n, m); i <= (m * n); i++) if (i % n == 0 && i % m == 0) System.out.println(i);
        scan.close();
    }

}
