import java.util.Scanner;

public class Rensyuu7_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p, q, i = 2;
        System.out.println("分子n");
        p = Integer.parseInt(scan.nextLine());
        System.out.println("分母q");
        q = Integer.parseInt(scan.nextLine());
        int min = Math.min(p, q);
        while (min >= i) {
            if (p % i == 0 && q % i == 0) {
                p /= i;
                q /= i;
            } else i++;
        }
        System.out.println(p + (q != 1 ? "/" + q : ""));
        scan.close();
    }
}
