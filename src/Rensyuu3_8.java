import java.util.Scanner;

public class Rensyuu3_8 {
    private static final int[] JPY_COINS = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("金額を入力");
        int n = Integer.parseInt(scan.nextLine());
        int[] result = new int[JPY_COINS.length];
        for (int i = 0; i < JPY_COINS.length; i++) {
            result[i] = n / JPY_COINS[i];
            n %= JPY_COINS[i];
        }
        print(result);
        scan.close();
    }

    public static void print(int[] coins){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < JPY_COINS.length; i++) {
            if (i != 0) str.append(", ");
            str.append(JPY_COINS[i]).append("円玉").append(coins[i]).append("枚");
        }
        System.out.println(str);
    }

}
