import java.util.Scanner;

public class Rensyuu3_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v, w, h;
        System.out.print("縦: ");
        v = Double.parseDouble(scan.nextLine());
        System.out.print("横: ");
        w = Double.parseDouble(scan.nextLine());
        System.out.print("高さ: ");
        h = Double.parseDouble(scan.nextLine());
        System.out.println("直方体の体積: " + v * w * h);
        System.out.println("直方体の表面積: " + (v * w + w * h + h * v) * 2);
        scan.close();
    }
}
