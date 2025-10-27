package org.konneyj.module2easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        checkException();
        createStudent();
        checkEqualsAndHashCode();
        sortStudentByComparator();
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

        System.out.println("-".repeat(50));
    }

    public static void createStudent() {
        Student student1 = new Student();
        Student student2 = new Student("Julie", 25);
        Student student3 = new Student("Sofia", 28, 10);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-".repeat(50));
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

        System.out.println("-".repeat(50));
    }

    public static void sortStudentByComparator() {
        List<Student> list = new ArrayList<>();

        // Заполняем список студентами
        list.add(new Student("Sofia", 28, 10));
        list.add(new Student("Julie", 25, 8));
        list.add(new Student("Anna", 23, 9));
        list.add(new Student("Margo", 38, 7));
        list.add(new Student("Jane", 45, 4));
        list.add(new Student("Kate", 18, 5));

        // Сортировка по имени
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("-".repeat(50));

        // Сортировка по среднему баллу (в обратном порядке)
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("-".repeat(50));
    }
}
