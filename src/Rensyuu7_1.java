import java.util.Scanner;

public class Rensyuu7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, q;
        System.out.println("整数x");
        x = Integer.parseInt(scan.nextLine());
        System.out.println("整数y");
        y = Integer.parseInt(scan.nextLine());
        q = x;
        while(q >= y) q -= y;
        System.out.println(x + " % " + y + " = " + q);
        scan.close();
    }
}
