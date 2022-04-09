import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rensyuu16_1 {
    private static final String file_path = "files/16_1.txt";

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in);PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file_path)))){
            System.out.println("氏名");
            String name = scan.nextLine();
            System.out.println("住所");
            String address = scan.nextLine();
            pw.println("氏名: " + name);
            pw.println("住所: " + address);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
