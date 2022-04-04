import java.util.Scanner;

public class A2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("自然数nを入力>> ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("nは素数" + (isPrimeNumber(n) ? "です" : "ではありません") + ".");
    }

    public static boolean isPrimeNumber(int n){
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
