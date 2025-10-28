package org.konneyj.module2easy;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMapRefactor {
    private final Map<String,Student> hashMap = new HashMap<>();

    public void addStudent(String studentId, Student student) {
        if (studentId == null) {
            throw new StudentNotFoundException("Id студента не может быть null. Поиск невозможен");
        }

        if (hashMap.containsKey(studentId)) {
            System.out.println("Студент с таким Id уже добавлен");
            return;
        }

        hashMap.put(studentId, student);
    }

    public Student getStudentById(String studentId) {
        if (studentId == null) {
            throw new StudentNotFoundException("Id студента не может быть null. Поиск невозможен");
        }

        if (!hashMap.containsKey(studentId)) {
            throw new StudentNotFoundException("Студента с таким Id нет");
        }

        return hashMap.get(studentId);
    }

    public void deleteStudentById(String studentId) {
        if (studentId == null) {
            throw new StudentNotFoundException("Id студента не может быть null. Удаление невозможно");
        }

        if (!hashMap.containsKey(studentId)) {
            throw new StudentNotFoundException("Студента с таким Id нет");
        }

        hashMap.remove(studentId);
        System.out.println("Удаление студента прошло успешно");
    }
}
