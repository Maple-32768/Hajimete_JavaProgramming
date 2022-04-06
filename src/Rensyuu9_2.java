import java.util.Scanner;

public class Rensyuu9_2 {
    private static final String[] subject_names = {"国語", "算数", "理科", "社会"};
    private static final String line = "-------------------------------";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scores = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println((i + 1) + "番目" + subject_names[j]);
                scores[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        System.out.println("生徒\t|\t国語\t算数\t理科\t社会\t|平均" + System.lineSeparator() + line);
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            System.out.print((i + 1) + "\t|\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(scores[i][j] + "\t");
                sum += scores[i][j];
            }
            System.out.println("|" + Math.round((sum * 25.0) / 100));
        }
        System.out.print(line + System.lineSeparator() + "平均\t|\t");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += scores[j][i];
            System.out.print(Math.round((sum * 100 / 3.0) / 100) + "\t");
        }
        System.out.println("|");
        scan.close();
    }
}
