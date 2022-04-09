import java.util.Scanner;

public class Rensyuu11_7 {
    private static class ZodiacSign {
        private final int begin_month;
        private final int begin_day;
        private final int end_month;
        private final int end_day;
        private final String name;

        public ZodiacSign(int begin_month, int begin_day, int end_month, int end_day, String name) {
            this.begin_month = begin_month;
            this.begin_day = begin_day;
            this.end_month = end_month;
            this.end_day = end_day;
            this.name = name;
        }

        public boolean isInRange(int month, int day) {
            return (month == begin_month && day >= begin_day) || (month == end_month && day <= end_day);
        }

        public String getName() {
            return name;
        }
    }

    private static final ZodiacSign[] signs = {
            new ZodiacSign(3, 21, 4, 20, "牡羊座"),
            new ZodiacSign(4, 21, 5, 20, "牡牛座"),
            new ZodiacSign(5, 21, 6, 21, "双子座"),
            new ZodiacSign(6, 22, 7, 22, "蟹座"),
            new ZodiacSign(7, 23, 8, 22, "獅子座"),
            new ZodiacSign(8, 23, 9, 22, "乙女座"),
            new ZodiacSign(9, 23, 10, 21, "天秤座"),
            new ZodiacSign(10, 21, 11, 21, "蠍座"),
            new ZodiacSign(11, 22, 21, 21, "射手座"),
            new ZodiacSign(12, 22, 1, 19, "山羊座"),
            new ZodiacSign(1, 20, 2, 18, "水瓶座"),
            new ZodiacSign(2, 19, 3, 20, "魚座")
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, d;
        System.out.println("月");
        m = Integer.parseInt(scan.nextLine());
        System.out.println("日");
        d = Integer.parseInt(scan.nextLine());
        for (ZodiacSign sign : signs) {
            if (sign.isInRange(m, d)) System.out.println(sign.getName());
        }
        scan.close();
    }
}
