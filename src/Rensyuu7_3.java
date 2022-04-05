import java.util.Scanner;

public class Rensyuu7_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, sum = 0;
        System.out.println("整数x");
        x = Integer.parseInt(scan.nextLine());
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.println("各桁の和 : " + sum);
        scan.close();
    }
}
