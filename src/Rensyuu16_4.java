import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Rensyuu16_4 {
    private static final String file_path = "files/16_4.txt";

    public static void main(String[] args){
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file_path)))){
            Random rand = new Random();
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 10; j++) {
                    int n = rand.nextInt(100) + 1;
                    pw.print(n + (j == 9 ? System.lineSeparator() : "\t"));
                }
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
