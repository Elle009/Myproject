public class Month {
    static int monthDayQuantity(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("No month with such number");
        }
        return monthNumber;
    }

    public static void main(String args[]) {
        int monthNumber = 2;
        monthDayQuantity(monthNumber);
    }
}

