import java.util.Scanner;

public class Rensyuu4_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("年を入力");
        int n = Integer.parseInt(scan.nextLine());
        if (n < 1600) System.out.println("西暦1600年以上ではありません");
        else if (isLeap(n)) System.out.println("うるう年です");
        else System.out.println("うるう年ではありません");
        scan.close();
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return true;
        } else return false;
    }
}
