import java.util.Scanner;

public class Rensyuu4_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数nを入力");
        int n = Integer.parseInt(scan.nextLine());
        if (n % 3 == 0 && n % 2 == 0) System.out.println("nは6の倍数です");
        else if (n % 3 == 0) System.out.println("nは3の倍数ですが、2の倍数ではありません");
        else if (n % 2 == 0) System.out.println("nは2の倍数ですが、3の倍数ではありません");
        else System.out.println("nは2の倍数でも3の倍数でもありません");
        scan.close();
    }


}
