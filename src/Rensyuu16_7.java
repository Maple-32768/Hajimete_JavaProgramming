import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Rensyuu16_7 {
    private static final String file_path = "files/16_7.txt";

    public static void main(String[] args){
        try(Scanner scan = new Scanner(new BufferedReader(new FileReader(file_path)))){
            while (scan.hasNext()){
                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    int n = Integer.parseInt(scan.next());
                    System.out.print(n + (i == 2 ? System.lineSeparator() : " "));
                    sum += n;
                }
                System.out.println("合計: " + sum);
                System.out.println("平均: " + sum / 3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
