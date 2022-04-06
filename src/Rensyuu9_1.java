import java.util.Scanner;

public class Rensyuu9_1 {
    private static final String[] subject_names = {"国語", "算数", "理科", "社会"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scores = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println((i + 1) + "番目" + subject_names[j]);
                scores[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) sum += scores[i][j];
            System.out.println((i + 1) + "番目の生徒の平均点:" + (float) sum / 4);
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) sum += scores[j][i];
            System.out.println(subject_names[i] + "の平均点:" + (float) sum / 3);
        }
        scan.close();
    }
}
