import java.util.Scanner;

public class Rensyuu3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h, w;
        System.out.print("縦の長さ: ");
        h = Integer.parseInt(scan.nextLine());
        System.out.print("横の長さ: ");
        w = Integer.parseInt(scan.nextLine());
        System.out.println("長方形の面積: " + h * w);
        scan.close();
    }
}
