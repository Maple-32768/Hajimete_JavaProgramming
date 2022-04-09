import java.util.Scanner;

public class Rensyuu7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("整数x");
        x = Integer.parseInt(scan.nextLine());
        System.out.println((int) Math.log10(x) + 1);
        scan.close();
    }
}
