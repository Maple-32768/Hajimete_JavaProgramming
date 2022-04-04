import java.util.Scanner;

public class Rensyuu3_4 {
    private static final double PI = Math.round(Math.PI * 100) / 100.0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("円の半径: ");
        double r = Double.parseDouble(scan.nextLine());
        System.out.println("円の面積: " + r * r * PI);
        scan.close();
    }
}
