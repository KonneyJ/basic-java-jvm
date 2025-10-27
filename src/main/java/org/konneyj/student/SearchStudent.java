package org.konneyj.student;

import java.util.*;

public class SearchStudent {
    public static void main(String[] args) {
        Random random = new Random();
        Student student1 = new Student("Julie", random.nextInt(16, 100),
                random.nextDouble(1, 5));
        Student student2 = new Student("Sofia", random.nextInt(16, 100),
                random.nextDouble(1, 5));
        Student student3 = new Student("Anna", random.nextInt(16, 100),
                random.nextDouble(1, 5));
        Student student4 = new Student("Kate", random.nextInt(16, 100),
                random.nextDouble(1, 5));
        Student student5 = new Student("Margo", random.nextInt(16, 100),
                random.nextDouble(1, 5));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Средние баллы всех студентов");
        students.stream()
                .forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));

        Optional<Student> topStudent = students.stream().max(Comparator.comparingDouble(Student::getAverageGrade));
        System.out.println("Студент с максимальным средним баллом: ");
        topStudent.ifPresent(System.out::println);
    }
}
