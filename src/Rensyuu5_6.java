import java.util.Scanner;

public class Rensyuu5_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("整数n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("整数m");
        m = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= Math.min(n, m); i++) if(n % i == 0 && m % i == 0) System.out.println(i);
        scan.close();
    }

}
