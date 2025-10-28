package org.konneyj.module2easy;

import org.konneyj.module2easy.shapes.Circle;
import org.konneyj.module2easy.shapes.Rectangle;
import org.konneyj.module2easy.shapes.Shape;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        checkIntroduce();
        checkInterfaceAndAbstractClass();
        checkStreamAPI();
        checkLoadFromFile();
        checkHashMap();
        checkHashMapWithException();
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

    public static void checkIntroduce() {
        Person[] arr = new Person[6];

        arr[0] = new Person();
        arr[1] = new Student();
        arr[2] = new Teacher();
        arr[3] = new Person();
        arr[4] = new Teacher();
        arr[5] = new Student();

        for (Person person : arr) {
            person.introduce();
        }
        System.out.println("-".repeat(50));
    }

    public static void checkInterfaceAndAbstractClass() {
        Shape circle = new Circle(10);
        circle.draw();
        Shape rectangle = new Rectangle(5, 2);
        rectangle.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        System.out.println("Сумма площадей круга " + circle + " и прямоугольника " + rectangle + " = " + sum);
        System.out.println("-".repeat(50));
    }

    public static void checkStreamAPI() {
        List<Student> list = new ArrayList<>();

        // Заполняем список студентами
        list.add(new Student("Afina", 28, 10));
        list.add(new Student("Julie", 25, 8));
        list.add(new Student("Anna", 23, 9));
        list.add(new Student("Ane", 18, 7));
        list.add(new Student("Jane", 45, 4));
        list.add(new Student("Annete", 28, 5));

        double grade = list.stream()
                .filter(s -> s.getAge() > 20)
                .filter(s -> s.getName().startsWith("A"))
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);
        System.out.println("Средний балл студентов: " + grade);
        System.out.println("-".repeat(50));
    }

    public static void checkLoadFromFile() {
        FileReader fileReader = null;
        BufferedReader br = null;
        try {
            fileReader = new FileReader("bufferedreader.txt");
            br = new BufferedReader(fileReader);

            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Получено исключение " + e.getClass());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Получено исключение " + e.getClass());
                }
            }
        }
        System.out.println("-".repeat(50));
    }

    public static void checkHashMap() {
        StudentHashMap hashMap = new StudentHashMap();
        Student student1 = new Student("id1", "Sofia", 28, 10);
        Student student2 = new Student("id2", "Julie", 25, 10);
        Student student3 = new Student("id3", "Sonya", 18, 10);
        List<Student> students = new ArrayList<>();

        hashMap.addStudent(student1.getStudentId(), student1);
        hashMap.addStudent(student2.getStudentId(), student2);
        hashMap.addStudent(student3.getStudentId(), student3);
        hashMap.addStudent(student1.getStudentId(), student1);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        long time1 = System.nanoTime();
        for (Student student : students) {
            if (student.getStudentId().equals(student3.getStudentId())) {
                break;
            }
        }
        long time2 = System.nanoTime();

        Student student = hashMap.getStudentById(student3.getStudentId());
        long time3 = System.nanoTime();

        long listTime = time2 - time1;
        long mapTime = time3 - time2;
        System.out.println("Время поиска по списку: " + listTime);
        System.out.println("Время поиска по хэшмапе: " + mapTime);
        if ((time3 - time2) < (time2 - time1)) {
            System.out.println("Реализация хэшмапы успешная");
        }

        hashMap.deleteStudentById(student2.getStudentId());
        hashMap.getStudentById(student2.getStudentId());

        System.out.println("-".repeat(50));
    }

    public static void checkHashMapWithException() {
        StudentHashMapRefactor hashMap = new StudentHashMapRefactor();
        Student student1 = new Student("id1", "Sofia", 28, 10);

        System.out.println("Добавление студента с корректным id");
        hashMap.addStudent(student1.getStudentId(), student1);
        try {
            System.out.println("Добавление студента с id = null");
            hashMap.addStudent(null, student1);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Добавление уже существующего студента");
        hashMap.addStudent(student1.getStudentId(), student1);
        System.out.println("Получение студента с корректным id");
        System.out.println(hashMap.getStudentById(student1.getStudentId()));

        System.out.println("Удаление студента с корректным id");
        hashMap.deleteStudentById(student1.getStudentId());
        try {
            System.out.println("Удаление студента с id = null");
            hashMap.deleteStudentById(null);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Удаление студента с некорректным id");
            hashMap.deleteStudentById("id");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Получение студента с некорректным id");
            hashMap.getStudentById(student1.getStudentId());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-".repeat(50));
    }
}
