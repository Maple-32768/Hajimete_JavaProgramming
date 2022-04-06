import java.util.Scanner;

public class Rensyuu10_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列");
        String str = scan.nextLine();
        System.out.println(str.charAt(str.length() - 1));
        scan.close();
    }
}
