public class Student {
    int numOfStudentTicket;
    String name;
    String surName;
    int course;
    double gpaFromMath;
    double gpaFromEconomic;
    double gpaFromLang;

    public Student(double gpaFromMath, double gpaFromEconomic, double gpaFromLang) {
        this.gpaFromMath = gpaFromMath;
        this.gpaFromEconomic = gpaFromEconomic;
        this.gpaFromLang = gpaFromLang;
    }
}
