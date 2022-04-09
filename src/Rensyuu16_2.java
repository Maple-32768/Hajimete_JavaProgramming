import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Rensyuu16_2 {
    private static final String file_path = "files/16_2.txt";

    public static void main(String[] args){
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file_path)))){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int n = (i + 1) * (j + 1);
                    if (j!= 0){
                        System.out.print("\t");
                        pw.print("\t");
                    }
                    System.out.print(n);
                    pw.print(n);
                }
                System.out.println();
                pw.println();
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
