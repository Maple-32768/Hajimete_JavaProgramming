import java.util.Scanner;

public class Rensyuu4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "番目の整数を入力");
            nums[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println(minInt(nums));
        scan.close();
    }

    public static int minInt(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
        }
        return min;
    }
}
