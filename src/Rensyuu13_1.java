import java.util.Scanner;

public class Rensyuu13_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(sumToN(n));
        scan.close();
    }

    public static int sumToN(int n) {
        return n > 0 ? n + sumToN(n - 1) : 0;
    }
}
