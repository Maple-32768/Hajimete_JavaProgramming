import java.util.Scanner;

public class Rensyuu3_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("数を入力してください");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("十の位は" + n / 10 + "、一の位は" + n % 10 + "です。");
        scan.close();
    }
}
