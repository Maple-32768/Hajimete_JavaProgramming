import java.util.Scanner;

public class Rensyuu11_4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("元素記号");
            String symbol = scan.nextLine();
            for (ChemicalElement element : ChemicalElement.ELEMENTS) {
                if (symbol.equals(element.symbol)) {
                    System.out.println(element.number + "(" + element.name + ")");
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No such chemical element found.");
        }
    }

}
