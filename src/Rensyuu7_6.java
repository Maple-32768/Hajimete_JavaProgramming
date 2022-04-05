import java.util.Scanner;

public class Rensyuu7_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 2;
        System.out.println("整数n");
        n = Integer.parseInt(scan.nextLine());
        System.out.print(n + " = ");
        boolean first = true;
        while (n != 1) {
            if (n % i == 0) {
                System.out.print((first ? "" : " * " ) + i);
                n /= i;
                first = false;
            } else i++;
        }
        scan.close();
    }
}
