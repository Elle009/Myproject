import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HW7 {

    public static void calculation(double[] array, int digit) {
        double[] array1 = new double[3];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] / digit;
            try {
                System.out.println(array1[4]);
            } catch (IndexOutOfBoundsException e) {

            } catch (ArithmeticException el) {

            }
            System.out.println(array1[i]);
        }
    }

    public static void main(String[] args) {
        double[] array = {1, 5, 8};
        int digit = 2;
        calculation(array, digit);

        List<String> numbers = new ArrayList<>();
        numbers.add("+380956786758");
        numbers.add("+250956786758");
        numbers.add("+809567867586");

        String regex = "^((\\+?380)([0-9]{9}))$";
        Pattern pattern = Pattern.compile(regex);

        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            System.out.println(number + ": " + matcher.matches());
        }
    }
}
