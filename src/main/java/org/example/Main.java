package org.example;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    static void main() {
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("420-SN1-RE", "Programming in Science", 3));
        courses.add(new Course("420-SN2-RE", "Advanced Programming", 3));
        courses.add(new Course("201-NYA-05", "Calculus I", 4));
        courses.add(new Course("201-NYB-05", "Calculus II", 4));
        courses.add(new Course("505-ZEN-05", "General Psychology", 2));
        courses.add(new Course("603-101-MQ", "English Communication", 2));
        /*
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);
        System.out.println(course5);
        System.out.println(course6);
         */

        Collections.sort(courses);

        for(Course course : courses){
            System.out.println(course);
        }
    }
}

