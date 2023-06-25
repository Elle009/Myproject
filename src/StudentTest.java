public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student(4.5, 4.9, 4.2);
        Student student2 = new Student(4.5, 3.9, 4.7);
        Student student3 = new Student(4.2, 4.4, 3.9);
        double averageArithmeticEvaluation1 = (student1.gpaFromMath + student1.gpaFromEconomic + student1.gpaFromLang) / 3;
        double averageArithmeticEvaluation2 = (student2.gpaFromMath + student2.gpaFromEconomic + student2.gpaFromLang) / 3;
        double averageArithmeticEvaluation3 = (student3.gpaFromMath + student3.gpaFromEconomic + student3.gpaFromLang) / 3;

        System.out.println("Average arithmetic evaluation of student 1 is " + averageArithmeticEvaluation1);
        System.out.println("Average arithmetic evaluation of student 2 is " + averageArithmeticEvaluation2);
        System.out.println("Average arithmetic evaluation of student 3 is " + averageArithmeticEvaluation3);
    }
}
