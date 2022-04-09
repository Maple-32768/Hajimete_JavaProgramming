import java.util.Scanner;

public class Rensyuu10_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列");
        String str = scan.nextLine();
        System.out.println(str + reverse(str));
        scan.close();
    }

    public static String reverse(String source) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            result.append(source.charAt(source.length() - i - 1));
        }
        return result.toString();
    }
}
