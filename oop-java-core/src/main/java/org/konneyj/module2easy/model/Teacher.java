package org.konneyj.module2easy.model;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    @Override
    public void introduce() {
        System.out.println("Всем привет! Я объект класса Teacher");
    }
}
