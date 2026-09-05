package Project.co;

import java.util.ArrayList;
import java.util.List;

public class Studentservice  {
    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 0;
    
    public Student Addsutdent(String name, int age, String major, double gpa) {
        Student newStudent = new Student(nextId, name, age, major, gpa);
        students.add(newStudent);
        nextId++;
        return newStudent;
    }
    public int getNextId() {
        return nextId;
    }
    public List<Student> Getallstudent() {
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }
    public Student FindbyId(int Id) {
        for (Student student : students) {
            if (student.getId() == Id) {
                return student;
            }
        }
        return null;
    }
    public Student Updatestudent(int Id, String name, String major, int age, double gpa) {
        Student student = FindbyId(Id);
        if(student == null ) {
            return null;
        }
        else {
            student.setName(name);
            student.setAge(age);
            student.setMajor(major);
            student.setGpa(gpa);
        }


        return student;
    }
    public boolean Deletestudent(int Id) {
        Student student = FindbyId(Id);
        if (student == null) {
            return false;
        }
        else {
            students.remove(student);

        }
        return true;


    }
    public double CalculateAvgGpa() {
        double result;
        if (students.isEmpty()) {
            return 0.0;
        }
        else {
            double sumGpa = 0.0;
            for (Student student: students) {
                sumGpa =+ student.getGpa();
            }
             result =  sumGpa / students.size();
        }
        return result;
    }
}
