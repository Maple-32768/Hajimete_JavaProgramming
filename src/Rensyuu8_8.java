import java.util.Scanner;

public class Rensyuu8_8 {
    private static final int[] days_in_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("日数");
        int days = Integer.parseInt(scan.nextLine()), m = 0, d = days;
        while (d > days_in_months[m]) {
            d -= days_in_months[m];
            m++;
        }
        System.out.println("1月1日から" + days + "日目は" + (m + 1) + "月" + (d + 1) + "日");
    }
}
