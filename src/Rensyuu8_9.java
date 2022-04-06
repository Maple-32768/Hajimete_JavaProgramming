import java.util.Calendar;

public class Rensyuu8_9 {
    private static final int birth_year = 1970;
    private static final int birth_month = 1;
    private static final int birth_day = 1;

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        Calendar birth = (Calendar) today.clone();
        birth.set(Calendar.YEAR, birth_year);
        birth.set(Calendar.MONTH, birth_month - 1);
        birth.set(Calendar.DATE, birth_day);
        int count = 0;
        while(!isSameDate(birth, today)) {
            birth.add(Calendar.DATE, 1);
            count++;
        }
        System.out.println("今日はあなたが生まれてから" + count + "日目です");
    }

    public static boolean isSameDate(Calendar a, Calendar b){
        return a.get(Calendar.YEAR) == b.get(Calendar.YEAR) &&
                a.get(Calendar.MONTH) == b.get(Calendar.MONTH) &&
                a.get(Calendar.DATE) == b.get(Calendar.DATE);
    }
}
