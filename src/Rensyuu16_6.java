import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Rensyuu16_6 {
    private static final String file_path = "files/16_6.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(file_path)))) {
            int sum = 0, count = 0;
            while (scan.hasNext()) {
                sum += Integer.parseInt(scan.nextLine());
                count++;
            }
            System.out.println("合計: " + sum);
            System.out.println("平均: " + sum / count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
