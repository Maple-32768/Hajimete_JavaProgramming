import java.util.Scanner;

public class Rensyuu5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("自然数n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("合計:" + sumOdd(n));
        scan.close();
    }

    public static int sumOdd(int n) {
        if (n % 2 == 0) n--;
        return n < 0 ? 0 : n + sumOdd(n - 2);
    }
}
