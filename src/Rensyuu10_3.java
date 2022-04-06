import java.util.Scanner;

public class Rensyuu10_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列");
        String str = scan.nextLine();
        System.out.println("整数n");
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++) result.append(str);
        System.out.println(result);
        scan.close();
    }
}
