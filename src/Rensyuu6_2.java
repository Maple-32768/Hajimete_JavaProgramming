import java.util.Random;

public class Rensyuu6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 10000; i++) if ((rand.nextInt(100) + 1) % 2 == 1) count++;
        System.out.println(count);
    }
}
