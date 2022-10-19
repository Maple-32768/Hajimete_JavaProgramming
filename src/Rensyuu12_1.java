import java.util.Scanner;

public class Rensyuu12_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("a");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("b");
        b = Integer.parseInt(scan.nextLine());
        System.out.println(add(a, b));
        scan.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
