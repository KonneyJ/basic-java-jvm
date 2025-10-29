package org.konneyj.module2easy.model;

public class Student extends Person {
    private String studentId;
    private double averageGrade;

    public Student() {

    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public Student(String studentId, String name, int age, double averageGrade) {
        super(name, age);
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    @Override
    public void introduce() {
        System.out.println("Всем привет! Я объект класса Student");;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade < 0 || averageGrade > 10) {
            throw new IllegalArgumentException("Передано некорректное значение. Оценка не может быть отрицательной " +
                    "или больше 10. Полученное значение: " + averageGrade);
        }
        this.averageGrade = averageGrade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name= " + super.getName() + '\'' +
                ", age= " + super.getAge() +
                ", averageGrade=" + averageGrade +
                "} ";
    }
}
