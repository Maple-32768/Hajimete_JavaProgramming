import java.util.Scanner;

public class Rensyuu5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("n! = " + fact(n));
        scan.close();
    }

    public static int fact(int n) {
        return n == 1 ? n : n * fact(n - 1);
    }
}
