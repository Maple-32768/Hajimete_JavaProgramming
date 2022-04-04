import java.util.Objects;
import java.util.Scanner;

public class Rensyuu4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("aを入力");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("bを入力");
        b = Integer.parseInt(scan.nextLine());
        System.out.println(Objects.equals(a, b) ? "aとbは同じです" : "aとbは異なる整数です");
        scan.close();
    }
}
