import java.util.Scanner;

public class Rensyuu11_5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("元素番号");
            int number = Integer.parseInt(scan.nextLine());
            for (ChemicalElement element : ChemicalElement.ELEMENTS) {
                if (number == element.number) {
                    System.out.println(element.symbol + "(" + element.name + ")");
                    break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No such chemical element found.");
        }
    }

}
