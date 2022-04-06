import java.util.Scanner;

public class Rensyuu10_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字");
        char c = scan.nextLine().charAt(0);
        if ('A' <= c && c <= 'Z') System.out.println("英字の大文字です");
        else System.out.println("英字の大文字ではありません");
    }
}
