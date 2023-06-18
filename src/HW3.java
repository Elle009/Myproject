public class HW3 {
    public static String theLongestWord(String firstWord, String secondWord, String thirdWord) {
        int stringLength1 = firstWord.length();
        int stringLength2 = secondWord.length();
        int stringLength3 = thirdWord.length();

        if (stringLength1 > stringLength2 && stringLength1 > stringLength3) {
            return firstWord;
        } else if (stringLength2 > stringLength1 && stringLength2 > stringLength3) {
            return secondWord;
        } else {
            return thirdWord;
        }
    }

    static void triangle1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = n - 1; a > 0; a--) {
            for (int b = a; b > 0; b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangle2(int n) {
        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle3(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println(theLongestWord("sun", "clouds", "today"));
        int n = 5;
        triangle1(n);
        triangle2(n);
        triangle3(n);
    }
}
