import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rensyuu16_3 {
    private static final String file_path = "files/16_3.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in); PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file_path)))) {
            int[] nums = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + "番目の数");
                nums[i] = Integer.parseInt(scan.nextLine());
            }
            for (int i = 0; i < 5; i++) {
                if (i != 0) {
                    System.out.print(" ");
                    pw.print(" ");
                }
                System.out.print(nums[i]);
                pw.print(nums[i]);
            }
            System.out.println();
            pw.println();
            System.out.println("合計:" + sum(nums));
            pw.println("合計:" + sum(nums));
            System.out.println("平均:" + average(nums));
            pw.println("平均:" + average(nums));
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int average(int[] array) {
        int sum = sum(array);
        return sum / array.length;
    }
}
