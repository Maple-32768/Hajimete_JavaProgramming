import java.util.Scanner;

public class Rensyuu5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数n");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) if(n % i == 0) System.out.println(i);
        scan.close();
    }

}
