public class Rensyuu2_3 {

    public static void main(String[] args) {
        Object o1 = 2 + 7 /* 2 + 7 = 9 */,
                o2 = 2 * 8 /* 2 * 8 = 16 */,
                o3 = 16 % 3 /* 16 % 3 = 1 */,
                o4 = 2 * 3 + 4 * 5 /* 2 * 3 + 4 * 5 = 6 + 20 = 26 */,
                o5 = 2 * (3 + 4) * 5 /* 2 * (3 + 4) * 5 = 10 * 7 = 70 */,
                o6 = 5 / 2 /* 5 / 2 = 2 */,
                o7 = 5 / 2.0 /* 5 / 2.0 = 2.5 */,
                o8 = 1.2 + 3.2 /* 1.2 + 3.2 = 4.4 */,
                o9 = 3 / 2 + 4 * 1.1 /* 3 / 2 + 4 * 1.1 = 1 + 4.4 = 5.4 */,
                o10 = 3 / 2.0 + 4 * 1.1 /* 3 / 2.0 + 4 * 1.1 = 1.5 + 4.4 = 5.9 */;
                System.out.println(o1);
        System.out.println(o1 + "が答です");
        System.out.println("答は" + o1);

        print(o2);
        print(o3);
        print(o4);
        print(o5);
        print(o6);
        print(o7);
        print(o8);
        print(o9);
        print(o10);
    }

    public static void print(Object o) {
        System.out.println(o);
        System.out.println("答は" + o);
    }
}
