import java.util.Scanner;

public class Rensyuu11_2 {
    private static final String[] words = {"argument", "boolean", "catch", "double", "exception", "float", "generate",
            "html", "int", "java", "key", "long", "main", "null", "object", "path", "queue", "random", "string", "try",
            "uuid", "void", "while", "xml", "year", "zip"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(words[scan.nextLine().toLowerCase().charAt(0) - 'a']);
        scan.close();
    }
}
