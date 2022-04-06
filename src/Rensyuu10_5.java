import java.util.Scanner;

public class Rensyuu10_5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("文字");
            Integer.parseInt(String.valueOf(scan.nextLine().charAt(0)));
            System.out.println("数字です");
        } catch (NumberFormatException e) {
            System.out.println("数字ではありません");
        }
    }
}
