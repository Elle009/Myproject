package Package1;

public class AnotherEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 4;
        employee1.surname = "Anredson";

        employee1.showInfo();
        System.out.printf(employee1.surname);
    }
}
