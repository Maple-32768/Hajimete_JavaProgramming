import java.util.Scanner;

public class Rensyuu10_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列");
        String str = scan.nextLine().toLowerCase();
        int[] alphabets = new int[26];
        for (int i = 0; i < str.length(); i++) alphabets[str.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++) System.out.println((char) ('a' + i) + ":" + alphabets[i]);
        scan.close();
    }
}
