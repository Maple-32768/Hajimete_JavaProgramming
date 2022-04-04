import java.util.Scanner;

public class Rensyuu2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("A:");
        a = Double.parseDouble(scan.nextLine());
        System.out.print("B:");
        b = Double.parseDouble(scan.nextLine());
        System.out.println(a + " % " + b + " = " + a % b);
    }
}
