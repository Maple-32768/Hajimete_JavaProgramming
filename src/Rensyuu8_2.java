import java.util.Scanner;

public class Rensyuu8_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }
        System.out.println(average(array));
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
