import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rensyuu16_11 {
    private static final String input_file_path = "files/16_11_in.txt";
    private static final String output_file_path = "files/16_11_out.txt";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(input_file_path)));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output_file_path)))) {
            List<TestScore> list = new ArrayList<>();
            int max_sum = Integer.MIN_VALUE;
            while (scan.hasNext()) {
                String str = scan.next();
                int[] values = new int[3];
                for (int i = 0; i < 3; i++) {
                    values[i] = Integer.parseInt(scan.next());
                }
                TestScore s = new TestScore(str, values);
                list.add(s);
                max_sum = Math.max(max_sum, s.sum_score);
            }
            boolean isFirst = true;
            for (TestScore testScore : list) {
                if (testScore.sum_score == max_sum) {
                    if (isFirst) isFirst = false;
                    else pw.println();
                    pw.println(testScore);
                }
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class TestScore {
        public final String name;
        public final int japanese;
        public final int math;
        public final int english;
        public final int sum_score;

        public TestScore(String n, int[] scores) {
            name = n;
            japanese = scores[0];
            math = scores[1];
            english = scores[2];
            sum_score = japanese + math + english;
        }

        @Override
        public String toString() {
            return "氏名 : " + name + System.lineSeparator() +
                    "国語 : " + japanese + System.lineSeparator() +
                    "数学 : " + math + System.lineSeparator() +
                    "英語 : " + english + System.lineSeparator() +
                    "合計 : " + sum_score;
        }
    }
}
