import java.util.Scanner;

public class Rensyuu3_3 {
    private static final double PI = Math.round(Math.PI * 100) / 100.0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("円の直径: ");
        double d = Double.parseDouble(scan.nextLine());
        System.out.println("円周の長さ: " + d * PI);
        scan.close();
    }
}
