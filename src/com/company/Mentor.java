package com.company;

public class Mentor extends Person{
    private String studentName;

    public Mentor(String name, int age, String studentName) {
        super(name, age);
        this.studentName = studentName;
    }

    public void takeAnExam(String studentName) {
        Student student = new Student("Artycov Sabyr", 20);
        student.explain();
        this.studentName = studentName;
    }

    public void addStudent() {
        this.studentName += studentName;
    }

    public String spisok () {
        return "Ментор: " + getName() + " Жашы: " + getAge() + " Студент: " + studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
