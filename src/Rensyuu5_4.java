import java.util.Scanner;

public class Rensyuu5_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("自然数n");
        int n = Integer.parseInt(scan.nextLine()), count = 0;
        for (int i = 1; i <= n; i++) if(i % 2 == 1 && i % 3 == 2) count++;
        System.out.println(count);
        scan.close();
    }

}
