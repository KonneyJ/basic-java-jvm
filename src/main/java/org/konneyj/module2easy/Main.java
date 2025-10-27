package org.konneyj.module2easy;

public class Main {
    public static void main(String[] args) {
        checkException();
        createStudent();
    }

    public static void checkException() {
        Student student = new Student();

        try {
            System.out.println("Попытка установить в поле averageGrade значение -1");
            student.setAverageGrade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Получено исключение IllegalArgumentException");
        }

        try {
            System.out.println("Попытка установить в поле averageGrade значение 15");
            student.setAverageGrade(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Получено исключение IllegalArgumentException");
        }
    }

    public static void createStudent() {
        Student student1 = new Student();
        Student student2 = new Student("Julie", 25);
        Student student3 = new Student("Sofia", 28, 10);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
