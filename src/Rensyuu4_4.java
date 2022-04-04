import java.util.Scanner;

public class Rensyuu4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("aを入力");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("bを入力");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("aはbの倍数" + (a % b == 0 ? "です" : "ではありません"));
        scan.close();
    }
}
