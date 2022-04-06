import java.util.Scanner;

public class Rensyuu10_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列");
        String str = scan.nextLine();
        System.out.println("整数n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(str.charAt(n));
        scan.close();
    }
}
