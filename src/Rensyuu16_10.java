import java.io.*;
import java.util.Scanner;

public class Rensyuu16_10 {
    private static final String input_file_path = "files/16_10_in.txt";
    private static final String output_file_path = "files/16_10_out.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(input_file_path)));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output_file_path)))) {
            while (scan.hasNext()) {
                int[] values = new int[3];
                for (int i = 0; i < 3; i++) {
                    values[i] = Integer.parseInt(scan.next());
                    pw.print(values[i]);
                    pw.print(i == 2 ? System.lineSeparator() : " ");
                }
                pw.println("合計 : " + sum(values));
                pw.println("平均 : " + average(values));
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int v : array) sum += v;
        return sum;
    }

    public static int average(int[] array) {
        return sum(array) / array.length;
    }
}
