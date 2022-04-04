import java.util.Scanner;

public class Rensyuu4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数を入力");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(n == 0 ? "0です" : n > 0 ? "プラスの数です" : "マイナスの数です");
        scan.close();
    }
}
