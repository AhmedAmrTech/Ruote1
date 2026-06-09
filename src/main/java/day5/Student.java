package day5;

public class Student {

    private String name;
    private int grade;


     public Student() {

    }

    public Student(String name, int grade) {
         this.name = name;
         setGrade(grade);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {

        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }else  {
            System.out.println("Invalid grade entered");
        }
    }
    public String getName() {
        System.out.println("My name is : "+name);
        return name;
    }
    public int getGrade() {
        System.out.println("My grade is : "+grade);
        return grade;
    }
}
