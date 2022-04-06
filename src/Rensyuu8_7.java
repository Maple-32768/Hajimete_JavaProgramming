import java.util.Scanner;

public class Rensyuu8_7 {
    private static final int[] days_in_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, d, days = 0;
        System.out.println("月");
        m = Integer.parseInt(scan.nextLine()) - 1;
        System.out.println("日");
        d = Integer.parseInt(scan.nextLine());
        for (int i = m; i < days_in_months.length; i++) days += days_in_months[i];
        days -= d;
        System.out.println("12月31日まで : " + days + "日");
    }
}
