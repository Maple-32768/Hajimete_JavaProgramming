import java.util.Scanner;

public class Rensyuu4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数を入力");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(abs(n));
        scan.close();
    }

    public static int abs(int n){
        return n < 0 ? n * -1 : n;
    }
}
