package org.konneyj.module2easy;

public class Main {
    public static void main(String[] args) {
        checkException();
        createStudent();
        checkEqualsAndHashCode();
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

    public static void checkEqualsAndHashCode() {
        Student student1 = new Student("Sofia", 28, 10);
        Student student2 = new Student("Julie", 25, 10);
        Student student3 = new Student("Sofia", 28, 10);

        System.out.println("Проверка на неравенство объектов: " + student1 + " и " + student2);
        boolean equal1 = student1.equals(student2);
        System.out.println(equal1);
        
        System.out.println("Проверка на равенство объектов: " + student1 + " и " + student3);
        boolean equal2 = student1.equals(student3);
        System.out.println(equal2);
    }
}
