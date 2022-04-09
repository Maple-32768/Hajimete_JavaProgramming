import java.util.Scanner;

public class Rensyuu12_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("a");
        a = Integer.parseInt(scan.nextLine());
        System.out.println("b");
        b = Integer.parseInt(scan.nextLine());
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + remove(a, b));
        System.out.println("a * b = " + multiply(a, b));
        try {
            System.out.println("a / b = " + divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot calculate a / b, because b = 0");
        }
        scan.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int remove(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("/0 is not defined.");
        return a / b;
    }
}
