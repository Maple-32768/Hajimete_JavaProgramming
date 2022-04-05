import java.util.Random;

public class Rensyuu6_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) if (rand.nextInt(100) < 33) count++;
        System.out.println(count);
    }
}
