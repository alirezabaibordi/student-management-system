package Project.co;

import java.util.ArrayList;

public class Studentservice extends Student {
    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 0;
    public Student Addsutdent(int nextId, String name, int Id, int age, String major, double gpa) {
        Student newStudent = new Student();
        students.add(newStudent);
        nextId++;
        return newStudent;
    }
    public Student Getallstudent() {
        for (Student student : students) {
            System.out.println(student);

        }
        return null;
    }
    public Student FindbyId(int Id) {
        for (Student student : students) {
            if (student.getId() == Id) {
                return student;
            }
        }
        return null;
    }
    public Student Updatestudent(String name, int Id, String major, int age, double gpa) {
        ُStudent student = FindbyId(Id);
        if(student == null ) {
            return null;
        }
        else {
            student.setName(name);
            student.setAge(age);
            student.setMajor(major);
            student.setGpa(gpa);
        }


    }
}
