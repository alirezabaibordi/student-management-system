package Project.co;

import java.util.ArrayList;

public class Studentservice {
    private ArrayList<Student> Student = new ArrayList<>();
    private int nextId = 0;
    public Student Addsutdent(int nextId, String name, int id, int age, String major, double gpa) {
        Student newStudent = new Student();
        Student.add(newStudent);
        nextId++;
        return newStudent;


    }
}
