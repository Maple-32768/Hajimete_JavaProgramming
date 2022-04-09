import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Rensyuu16_5 {
    private static final String file_path = "files/16_5.txt";

    public static void main(String[] args){
        try(Scanner scan = new Scanner(new BufferedReader(new FileReader(file_path)))){
            double[] values = new double[4];
            for (int i = 0; i < 4; i++) {
                values[i] = Double.parseDouble(scan.next());
                System.out.print(values[i] + (i == 3 ? System.lineSeparator() : " "));
            }
            System.out.println("合計: " + sum(values));
            System.out.println("平均: " + average(values));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double sum(double[] array){
        double sum = 0;
        for (double v : array) sum += v;
        return sum;
    }

    public static double average(double[] array){
        return sum(array) / array.length;
    }
}
