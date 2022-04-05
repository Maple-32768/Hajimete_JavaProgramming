public class Rensyuu7_5 {
    private static final int PERCENT = 3;
    private static final int MONEY1 = 100000;
    private static final int MONEY2 = 120000;

    public static void main(String[] args) {
        int n = 0, money = MONEY1;
        while(money < MONEY2){
            money *= 1 + (PERCENT / 100.0);
            n++;
        }
        System.out.println(n);
    }
}
