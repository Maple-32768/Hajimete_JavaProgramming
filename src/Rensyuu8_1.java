import java.util.Scanner;

public class Rensyuu8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "番目の値");
            values[i] = Integer.parseInt(scan.nextLine());
        }
        double avg = average(values);
        for (int i : values) {
            if (i == avg) System.out.println(i + "は平均と同じです");
            else if (i < avg) System.out.println(i + "は平均より小さいです");
            else System.out.println(i + "は平均より大きいです");
        }
        scan.close();
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
