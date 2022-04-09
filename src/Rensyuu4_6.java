import java.util.Scanner;

public class Rensyuu4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "番目の整数を入力");
            nums[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println(maxInt(nums));
        scan.close();
    }

    public static int maxInt(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        return max;
    }
}
