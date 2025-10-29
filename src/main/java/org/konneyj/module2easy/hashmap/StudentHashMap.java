package org.konneyj.module2easy.hashmap;

import org.konneyj.module2easy.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    private final Map<String, Student> hashMap = new HashMap<>();

    public void addStudent(String studentId, Student student) {
        if (studentId == null) {
            System.out.println("Id студента не может быть null. Добавление студента невозможно");
            return;
        }

        if (hashMap.containsKey(studentId)) {
            System.out.println("Студент с таким Id уже добавлен");
            return;
        }

        hashMap.put(studentId, student);
    }

    public Student getStudentById(String studentId) {
        if (studentId == null) {
            System.out.println("Id студента не может быть null. Поиск невозможен");
            return null;
        }

        if (!hashMap.containsKey(studentId)) {
            System.out.println("Студента с таким Id нет");
            return null;
        }

        return hashMap.get(studentId);
    }

    public void deleteStudentById(String studentId) {
        if (studentId == null) {
            System.out.println("Id студента не может быть null. Удаление невозможно");
            return;
        }

        if (!hashMap.containsKey(studentId)) {
            System.out.println("Студента с таким Id нет");
            return;
        }

        hashMap.remove(studentId);
        System.out.println("Удаление студента прошло успешно");
    }
}
