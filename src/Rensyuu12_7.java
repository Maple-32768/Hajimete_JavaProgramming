import java.util.Scanner;

public class Rensyuu12_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m;
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("nとmの最大公約数は" + gcd(n, m));
        scan.close();
    }

    public static int gcd(int a, int b){
        int i = Math.min(a, b);
        while (i > 0){
            if (a % i == 0 && b % i-- == 0) break;
            i--;
        }
        return i;
    }
}
