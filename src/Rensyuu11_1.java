import java.util.Scanner;

public class Rensyuu11_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(String.valueOf(scan.nextLine().charAt(0)));
        String eng  = "";
        switch (n){
            case 0:
                eng = "zero";
                break;
            case 1:
                eng = "one";
                break;
            case 2:
                eng = "two";
                break;
            case 3:
                eng = "three";
                break;
            case 4:
                eng = "four";
                break;
            case 5:
                eng = "five";
                break;
            case 6:
                eng = "six";
                break;
            case 7:
                eng = "seven";
                break;
            case 8:
                eng = "eight";
                break;
            case 9:
                eng = "nine";
                break;
        }
        System.out.println(n + "は英語で" + eng + "です");
        scan.close();
    }
}
