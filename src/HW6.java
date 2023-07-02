import java.util.*;

public class HW6 {
    public static void main(String[] args) {
        int[] array1 = {5, 11, 7, 20};

        Arrays.sort(array1);

        int currentMin = array1[0 + 1] - array1[0];
        for (int i = 0; i < array1.length - 1; i++) {
            int difference = array1[i + 1] - array1[i];
            if (difference < currentMin) {
                currentMin = difference;
            }
        }
        System.out.println(String.valueOf(currentMin));

        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Book1");
        list.add(1, "Book2");
        list.add(2, "Book3");
        list.add(3, "Book4");
        list.add(4, "Book5");
        map.put("1", list);

        String key = "1";
        System.out.println(map.get(key));
    }
}

