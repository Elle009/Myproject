public class Student1 {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setGrade(int grade1) {
        if (grade1>0 && grade1<11)
            grade = grade1;
        }
        public void setCourse ( int course1){
        if (course1>0 && course1<5)
            course = course1;
        }

    void showInfo () {
            System.out.printf("Name:" + name + "; Course:" + course + "; Grade:" + grade);
       }
}
