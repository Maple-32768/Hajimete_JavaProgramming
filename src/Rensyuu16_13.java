import java.io.*;
import java.util.Scanner;

public class Rensyuu16_13 {
    private static final String input_file_path = "files/16_13_in.txt";
    private static final String output_file_path = "files/16_13_out.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(input_file_path)));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output_file_path)))) {
            StringBuilder str = new StringBuilder();
            while (scan.hasNext()) str.append(scan.nextLine()).append(System.lineSeparator());
            int lower = 0, upper = 0, space = 0, other = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (String.valueOf(c).equals(System.lineSeparator())) continue;
                if ('a' <= c && c <= 'z') lower++;
                else if ('A' <= c && c <= 'Z') upper++;
                else if (c == '\u0020') space++;
                else other++;
            }
            pw.println("原文" + System.lineSeparator() + "-------------------------------------------------" + System.lineSeparator() +
                    str + "-------------------------------------------------" + System.lineSeparator());
            pw.println("大文字 : " + upper);
            pw.println("小文字 : " + lower);
            pw.println("スペース : " + space);
            pw.println("その他記号など : " + other);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
