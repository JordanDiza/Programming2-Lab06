package org.example;

public class CourseNameComparator implements Comparable<Course>{

        public int compareTo(Course c1, Course c2) {
            return c1.getName().compareTo(c2.getName());
        }
}
