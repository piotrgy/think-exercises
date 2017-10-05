package chapter3.exercise1;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int grade;
    private int studentID;
    private String name;

    public Student(int grade, int studentID, String name) {
        this.grade = grade;
        this.studentID = studentID;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudentName() {
        return name;
    }

    public int compareTo(Student student) {
        int comparedGrade = student.getGrade();

        //ascending
        //return this.grade - comparedGrade;

        //descending
        return comparedGrade - this.grade;
    }

    public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {
        public int compare(Student student1, Student student2) {
            String student1Name = student1.getStudentName();
            String student2Name = student2.getStudentName();

            //ascending
            //return student1Name.compareToIgnoreCase(student2Name);

            //descending
            return student2Name.compareToIgnoreCase(student1Name);
        }
    };

    @Override
    public String toString() {
        return "StudentID: " + studentID +
                ", name: " + name +
                ", grade: " + grade;
    }
}
