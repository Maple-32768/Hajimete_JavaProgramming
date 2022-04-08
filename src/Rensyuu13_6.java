import java.util.Scanner;

public class Rensyuu13_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        System.out.println("x");
        x = Integer.parseInt(scan.nextLine());
        System.out.println("y");
        y = Integer.parseInt(scan.nextLine());
        System.out.println("z");
        z = Integer.parseInt(scan.nextLine());
        System.out.println("tarai(x, y, z) = " + tarai(x, y, z));
        scan.close();
    }

    public static int tarai(int x, int y, int z) {
        return x <= y ? y : tarai(tarai(x - 1, y, z), tarai(y - 1, z, x), tarai(z - 1, x, y));
    }
}
