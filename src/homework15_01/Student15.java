package homework15_01;

public class Student15 {
    public static void main(String[] args) {
        Student student = new Student(21,"Viktor","cohort-33" );

        student.programming();
        student.sport();
        student.english();
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
        System.out.println("Student group: " + student.group);


    }
}
