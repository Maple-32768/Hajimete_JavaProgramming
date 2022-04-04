import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A2_3 {
    public static List<Integer> prime_numbers;
    public static int max_checked_numbers;

    public static void main(String[] args) {
        prime_numbers = new ArrayList<>();
        max_checked_numbers = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("最小値>> ");
        int min = Integer.parseInt(scan.nextLine());
        System.out.print("最大値>> ");
        int max = Integer.parseInt(scan.nextLine());
        System.out.println(getPrime_numbersFromRange(min, max).size());
    }

    public static List<Integer> getPrime_numbers(int max){
        if (max < 2) throw new IllegalArgumentException("Prime numbers are defined for integers greater than or equal to 2.");
        List<Integer> result = new ArrayList<>();
        if (max <= max_checked_numbers) {
            for (Integer prime_number : prime_numbers) {
                if (prime_number > max) break;
                result.add(prime_number);
            }
        } else {
            for (int i = max_checked_numbers; i <= max; i++) {
                if (i < 2) continue;
                boolean isPrime = true;
                for (int prime_number : prime_numbers) {
                    isPrime = i % prime_number != 0;
                    if (!isPrime) break;
                }
                if (isPrime) prime_numbers.add(i);
            }
            max_checked_numbers = max;
            result = new ArrayList<>(prime_numbers);
        }
        return result;
    }

    public static List<Integer> getPrime_numbersFromRange(int min, int max){
        List<Integer> result = getPrime_numbers(max);
        while(result.get(0) < min) result.remove(0);
        return result;
    }
}
