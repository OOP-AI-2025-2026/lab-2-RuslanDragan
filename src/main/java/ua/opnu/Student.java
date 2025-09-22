package ua.opnu;

import java.util.ArrayList;

class Student {
    private String name;
    private int year; // від 1 до 4
    private ArrayList<String> courses;

    // Конструктор
    Student(String name, int year) {
        this.name = name;
        if (year < 1) {
            this.year = 1;
        } else if (year > 4) {
            this.year = 4;
        } else {
            this.year = year;
        }
        this.courses = new ArrayList<>();
    }

    // Додає дисципліну
    void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            courses.add(courseName);
        }
    }

    // Видаляє всі дисципліни
    void dropAll() {
        courses.clear();
    }

    // Повертає кількість дисциплін
    int getCourseCount() {
        return courses.size();
    }

    // Повертає ім'я студента
    String getName() {
        return name;
    }

    // Повертає рік навчання
    int getYear() {
        return year;
    }

    // Повертає суму за навчання (20000 за рік)
    int getTuition() {
        return year * 20000;
    }

    // Тестовий main
    public static void main(String[] args) {
        Student student = new Student("Олександр", 3);

        // Додаємо дисципліни
        student.addCourse("Математика");
        student.addCourse("Фізика");
        student.addCourse("Інформатика");

        // Виводимо дані
        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}