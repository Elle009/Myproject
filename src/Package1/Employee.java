package Package1;

public class Employee {
    private int salary;
    public String surname;
    int id;

    public Employee() {
    }

    private Employee(int salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    void Employee(int salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    void showInfo() {
        System.out.printf("Salary is " + salary + "; Surname is " + surname + "; Id is " + id);
    }

    int increaseSalary(int salary1) {
        salary += salary1;
        return salary;
    }

    int decreaseSalary(int salary1) {
        salary -= salary1;
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary = 56;
        employee.surname = "Jonhson";
        employee.id = 675;

        employee.showInfo();
        employee.increaseSalary(100);
        employee.showInfo();
    }
}
