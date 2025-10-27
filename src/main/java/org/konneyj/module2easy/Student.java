package org.konneyj.module2easy;

import java.util.Objects;

public class Student extends Person {
    private String name;
    private int age;
    private double averageGrade;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    @Override
    public void introduce() {
        System.out.println("Всем привет! Я объект класса Student");;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade < 0 || averageGrade > 10) {
            throw new IllegalArgumentException("Передано некорректное значение. Оценка не может быть отрицательной " +
                    "или больше 10. Полученное значение: " + averageGrade);
        }
        this.averageGrade = averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(averageGrade, student.averageGrade) == 0
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, averageGrade);
    }
}
