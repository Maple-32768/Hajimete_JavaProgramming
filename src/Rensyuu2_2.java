public class Rensyuu2_2 {
    private static final String str = "プログラミング";

    public static void main(String[] args) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.length() - j - 1 > i) System.out.print('\u3000');
                else {
                    System.out.println(str.substring(0, i + 1));
                    break;
                }
            }
        }
    }
}
