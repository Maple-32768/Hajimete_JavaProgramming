import java.util.Random;

public class Rensyuu8_6 {
    private static final int dice_faces = 6;
    private static final int dices = 2;

    public static void main(String[] args) {
        int[] counts = new int[dice_faces];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < dices; j++) {
                min = Math.min(min, rand.nextInt(dice_faces));
            }
            counts[min]++;
        }
        for (int i = 0; i < dice_faces; i++) {
            System.out.println("最小値が" + (i + 1) + "になった回数: " + counts[i]);
        }
    }
}
