import java.util.Scanner;

public class Rensyuu3_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t, b, h;
        System.out.print("上底: ");
        t = Double.parseDouble(scan.nextLine());
        System.out.print("下底: ");
        b = Double.parseDouble(scan.nextLine());
        System.out.print("高さ: ");
        h = Double.parseDouble(scan.nextLine());
        System.out.println("台形の面積: " + (t + b) * h / 2);
        scan.close();
    }
}
