import java.util.Scanner;

public class Rensyuu5_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数n");
        int n = Integer.parseInt(scan.nextLine()), m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
            System.out.println(i + "! = " + m);
        }
        scan.close();
    }
}
