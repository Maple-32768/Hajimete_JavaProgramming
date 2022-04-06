import java.util.Scanner;

public class Rensyuu10_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("文字列1");
        String str1 = scan.nextLine();
        System.out.println("文字列2");
        String str2 = scan.nextLine();
        System.out.println(str1 + "は" + str2 + "を"+ (contains(str1, str2) ? "含んでいます" : "含んでいません"));
        scan.close();
    }

    public static boolean contains(String a, String b){
        try{
            for (int i = 0; i < a.length(); i++) {
                StringBuilder substring_a = new StringBuilder();
                for (int j = 0; j < b.length(); j++) {
                    substring_a.append(a.charAt(i + j));
                }
                if (substring_a.toString().equals(b)) return true;
            }
        } catch (IndexOutOfBoundsException ignored){}
        return false;
    }
}
