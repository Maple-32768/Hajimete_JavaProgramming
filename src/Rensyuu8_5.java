import java.util.Random;

public class Rensyuu8_5 {
    public static void main(String[] args) {
        int[] counts = new int[16];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += rand.nextInt(6);
            }
            counts[sum]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("和が" + (i + 3) + "になった回数: " + counts[i]);
        }
    }
}
