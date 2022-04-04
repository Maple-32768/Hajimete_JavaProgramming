import java.util.ArrayList;
import java.util.List;

public class A2_2 {
    public static void main(String[] args) {
        List<Integer> prime_numbers = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int prime_number : prime_numbers) {
                isPrime = i % prime_number != 0;
                if (!isPrime) break;
            }
            if (isPrime) prime_numbers.add(i);
        }
        int count = 0;
        for (Integer prime_number : prime_numbers) {
            if (prime_number >= 100 && isPalindrome(prime_number.toString())) count++;
        }
        System.out.println("3桁の回文素数は" + count + "個");
    }

    public static boolean isPalindrome(String str){
        return str.equals(reverse(str));
    }

    public static String reverse(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0, length = str.length(); i < length; i++) {
            result.append(str.charAt(length - i - 1));
        }
        return result.toString();
    }
}
