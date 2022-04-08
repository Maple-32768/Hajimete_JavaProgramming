import java.util.Scanner;

public class Rensyuu12_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("n");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("nとmの最小公倍数は" + lcm(n, m));
        scan.close();
    }

    public static int lcm(int a, int b) {
        int i = Math.max(a, b);
        while (i < Integer.MAX_VALUE) {
            if (i % a == 0 && i % b == 0) break;
            i++;
        }
        return i;
    }
}
