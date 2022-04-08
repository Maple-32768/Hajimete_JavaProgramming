import java.util.Scanner;

public class Rensyuu13_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(fibonacci(n));
        scan.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n, 2, 0, 1);
    }

    private static int fibonacci(int n, int index, int a, int b) {
        int c = a + b;
        if (n <= index) return c;
        else return fibonacci(n, index + 1, b, c);
    }
}
