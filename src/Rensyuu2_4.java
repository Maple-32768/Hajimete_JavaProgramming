public class Rensyuu2_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 0) System.out.print('\t');
                System.out.print(i * 3 + j + 1);
            }
            System.out.println();
        }
    }
}
