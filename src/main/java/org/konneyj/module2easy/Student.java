package org.konneyj.module2easy;

public class Student {
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
}
