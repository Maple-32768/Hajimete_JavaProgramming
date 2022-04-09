import java.util.Scanner;

public class GenerateHTML {
    private static final String URL = "https://github.com/Maple-32768/Hajimete_JavaProgramming/blob/master/src/Rensyuu";
    private static final String INDENT = "\u0020\u0020\u0020\u0020";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chapter, amount;
        System.out.println("章番号");
        chapter = Integer.parseInt(scan.nextLine());
        System.out.println("問題数");
        amount = Integer.parseInt(scan.nextLine());
        System.out.println(INDENT + "<p>" + System.lineSeparator() +
                INDENT + INDENT + "<h4>" + System.lineSeparator() +
                INDENT + INDENT + INDENT + "<label class=\"question\">第" + chapter + "章 練習問題</label>" + System.lineSeparator() +
                INDENT + INDENT + "</h4>");
        for (int i = 1; i <= amount; i++) {
            System.out.println(INDENT + INDENT + "<a href=\"" + URL + chapter + '_' + i + ".java\" class=\"mgr-20\">" + System.lineSeparator() +
                    INDENT + INDENT + INDENT + chapter + '.' + i + System.lineSeparator() +
                    INDENT + INDENT + "</a>");
        }
        scan.close();
    }
}
