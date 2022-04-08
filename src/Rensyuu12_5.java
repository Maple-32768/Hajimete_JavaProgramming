import java.util.Scanner;

public class Rensyuu12_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("xは" + getDigitsNumber(x) + "桁");
        scan.close();
    }

    public static int getDigitsNumber(int x) {
        return (int) Math.log10(x) + 1;
    }
}
