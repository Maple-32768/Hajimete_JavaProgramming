import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    private static final char[] kanji = {'一','二','三'};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lines = new int[3];
        System.out.println("三つの整数を入力してください.");
        for (int i = 0; i < 3; i++) {
            System.out.print(kanji[i] + "つ目>> ");
            lines[i] = Integer.parseInt(scan.nextLine());
        }
        int max_index = maxIndex(lines);
        if (!isTriangle(lines, max_index)) {
            System.out.println(getResultString(lines) + "では三角形は作れません.");
            return;
        }

        if (isEqTriangle(lines)){
            System.out.println(getResultString(lines) + "で正三角形が作れます.");
            return;
        }

        boolean iso = isIsoTriangle(lines), right = isRightTriangle(lines, max_index);
        if (iso && right){
            System.out.println(getResultString(lines) + "で直角二等辺三角形が作れます.");
        } else if(iso){
            System.out.println(getResultString(lines) + "で二等辺三角形が作れます.");
        } else if (right){
            System.out.println(getResultString(lines) + "で直角三角形が作れます.");
        } else {
            System.out.println(getResultString(lines) + "で三角形が作れます.");
        }
    }

    public static int maxIndex(int[] v){
        int max = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < v.length; i++) {
            if (max <= v[i]){
                max = v[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean isTriangle(int[] lines, int maxIndex){
        int sum = 0;
        for (int i = 0; i < lines.length; i++) {
            if (i == maxIndex) sum -= lines[i];
            else sum += lines[i];
        }
        return sum > 0;
    }

    public static boolean isIsoTriangle(int[] lines){
        return lines[0] == lines[1] || lines[0] == lines[2] || lines[1] == lines[2];
    }

    public static boolean isRightTriangle(int[] lines, int maxIndex){
        int sum = 0;
        for (int i = 0; i < lines.length; i++) {
            if (i == maxIndex) sum -= lines[i] * lines[i];
            else sum += lines[i] * lines[i];
        }
        return sum == 0;
    }

    public static String getResultString(int[] lines){
        return "三つの数 " + lines[0] + " " + lines[1] + " " + lines[2] + " ";
    }

    public static boolean isEqTriangle(int[] lines){
        return lines[0] == lines[1] && lines[0] == lines[2];
    }

}
