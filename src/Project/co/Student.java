package Project.co;

import java.util.ArrayList;

public class Student {

    private int getId;
    private String name;
    private int Id;
    private String major;
    private int age;
    private double gpa;

    public Student(int Id, String name, int age, String major, double gpa) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return Id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setGpa(double gpa) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return name + "   Age:" + age + "   Major:" + major + "   GPA:" + gpa;

    }



}
