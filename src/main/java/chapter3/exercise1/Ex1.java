package chapter3.exercise1;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        int[] grades = {87, 28, 100, 78, 84, 98};
        int[] studentIDs = {10002, 10003, 10004, 10005, 10006, 10007};
        String[] studentsNames = {"Chris", "Robert", "John", "Alice", "Kate", "Maria"};

        int size = grades.length;
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = new Student(grades[i], studentIDs[i], studentsNames[i]);
        }

        Arrays.sort(students);
        System.out.println("Students sorted by grade.");
        displayStudents(students);

        Arrays.sort(students, Student.StudentNameComparator);
        System.out.println("Students sorted by name.");
        displayStudents(students);
    }

    private static void displayStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}
