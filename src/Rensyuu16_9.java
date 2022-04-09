import java.io.*;
import java.util.Scanner;

public class Rensyuu16_9 {
    private static final String input_file_path = "files/16_9_in.txt";
    private static final String output_file_path = "files/16_9_out.txt";

    public static void main(String[] args){
        try(Scanner scan = new Scanner(new BufferedReader(new FileReader(input_file_path)));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output_file_path)))){
            double[] values = new double[4];
            for (int i = 0; i < 4; i++) {
                values[i] = Double.parseDouble(scan.next());
            }
            pw.println("合計 : " + sum(values));
            pw.println("平均 : " + average(values));
            pw.flush();
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
