import java.util.Scanner;

public class Rensyuu12_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;
        System.out.println("n");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("k");
        k = Integer.parseInt(scan.nextLine());
        System.out.println("n ^ k = " + pow(n, k));
        scan.close();
    }

    public static int pow(int n, int k) {
        int result = 1;
        for (int i = 0; i < k; i++) result *= n;
        return result;
    }
}
