import java.util.Scanner;

public class Rensyuu11_3 {
    private static final String[] japanese = {"月", "火", "水", "木", "金", "土", "日"};
    private static final String[][] english = {{"Monday", "Mon"}, {"Tuesday", "Tues", "Tue"},
            {"Wednesday", "Wed"}, {"Thursday", "Thurs", "Thu", "Th"}, {"Friday", "Fri"},
            {"Saturday", "Sat"}, {"Sunday", "Sun"}};

    public static void main(String[] args) {
        class ExitLoop extends Throwable{}
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("曜日(英語)");
            String input = scan.nextLine();
            for (int i = 0; i < english.length; i++) {
                for (int j = 0; j < english[i].length; j++) {
                    if (input.equals(english[i][j])){
                        System.out.println(japanese[i] + "曜日");
                        throw new ExitLoop();
                    }
                }
            }
        } catch (ExitLoop ignored) {}
    }
}
