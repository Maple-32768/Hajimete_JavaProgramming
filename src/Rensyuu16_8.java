import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Rensyuu16_8 {
    private static final String file_path = "files/16_8.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(file_path)))) {
            String str = scan.nextLine();
            System.out.println(str);
            int upper = 0, lower = 0, space = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ('A' <= c && c <= 'Z') upper++;
                else if ('a' <= c && c <= 'z') lower++;
                else if (c == '\u0020') space++;
            }
            System.out.println("大文字 : " + upper);
            System.out.println("小文字 : " + lower);
            System.out.println("空白 : " + space);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
