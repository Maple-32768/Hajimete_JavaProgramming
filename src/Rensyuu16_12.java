import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rensyuu16_12 {
    private static final String input_file_path = "files/16_12_in.txt";
    private static final String output_file_path = "files/kekka.txt";
    private static final String[] subjects = {"国語", "数学", "英語"};

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(input_file_path)));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output_file_path)))) {
            List<TestScore> list = new ArrayList<>();
            int[] max = new int[3];
            for (int i = 0; i < 3; i++) max[i] = Integer.MIN_VALUE;
            while (scan.hasNext()) {
                String str = scan.next();
                int[] values = new int[3];
                for (int i = 0; i < 3; i++) {
                    values[i] = Integer.parseInt(scan.next());
                }
                TestScore s = new TestScore(str, values);
                list.add(s);
                for (int i = 0; i < 3; i++) {
                    max[i] = Math.max(max[i], s.scores[i]);
                }
            }
            for (int i = 0; i < 3; i++) {
                if (i != 0) pw.println();
                pw.println(subjects[i] + "の最高得点者");
                for (TestScore testScore : list) {
                    if (testScore.scores[i] == max[i]) pw.println(testScore.name);
                }
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class TestScore {
        public final String name;
        public final int[] scores;

        public TestScore(String n, int[] scores) {
            name = n;
            this.scores = scores;
        }
    }
}
