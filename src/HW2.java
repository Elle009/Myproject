import java.util.Scanner;

public class HW2 {

    public static int digitSum(int number) {
        int sum = 0;
        for (int i = 0; number > 10; i++) {
            sum += number % 10;
            number = number / 10;
        }
        ;
        sum = sum + number % 10;
        return sum;
    }

    public static String digitSum(String word1, String word2) {
        int stringLength = word1.length() + word2.length();
        return String.valueOf(stringLength);
    }

    public static boolean digitSum() {
        Scanner console = new Scanner(System.in);
        int i1 = console.nextInt();
        if (i1 > 0) {
            System.out.printf("Digit more than 0");
            ;
        } else {
            System.out.printf("Digit less than 0");
            ;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(455));
        System.out.printf(digitSum("firstword", "secondword"));
        System.out.printf(String.valueOf(digitSum()));
    }
}
