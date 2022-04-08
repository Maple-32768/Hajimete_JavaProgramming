import java.util.Scanner;

public class Rensyuu12_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(isPrimeNumber(n) ? "nは素数です" : "nは素数ではありません");
        scan.close();
    }

    public static boolean isPrimeNumber(int n){
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
