package com.alextheedom.maps;

import java.util.*;

/**
 * Created by developer on 08/11/2015.
 */
public class Java8PlayPen {


    public static void main(String... args) {
//        ComputeIfAbsent1();
//        ComputeIfAbsent2();

        Student student1 = new Student("John", "Smith", 10);
        Student student2 = new Student("Adrian", "Smith", 3);
        Student student3 = new Student("Steven", "McRoy", 30);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        Comparator<Student> studentByLastname = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());
        students.sort(studentByLastname);
        System.out.println(students);

        Comparator<Student> studentByScore = (s1, s2) -> Integer.compare(s1.getScore(), s2.getScore());
        students.sort(studentByScore);
        System.out.println(students);

        students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
        System.out.println(students);

    }

    private static void ComputeIfAbsent2() {
        Map<String, Message> messages = new HashMap<>();
        messages.computeIfAbsent("Warning", m -> new Message()).setMessage("Fasten Seat Belts");
        System.out.println(messages.computeIfAbsent("Warning", m -> new Message()).getMessage());
    }

    private static void ComputeIfAbsent1() {
        Map<String, List<String>> preferences = new HashMap<>();
        preferences.computeIfAbsent("Alex", k -> new ArrayList<>()).add("Red");
        preferences.computeIfAbsent("Alex", k -> new ArrayList<>()).add("Blue");
        System.out.println(preferences);
    }


}
