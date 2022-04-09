import java.util.Scanner;

public class Rensyuu11_6 {
    private static final String[] KYUUREKI = {"睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月", "葉月", "長月", "神無月", "霜月", "師走"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("月の数");
        System.out.println(KYUUREKI[Integer.parseInt(scan.nextLine()) - 1]);
        scan.close();
    }
}
