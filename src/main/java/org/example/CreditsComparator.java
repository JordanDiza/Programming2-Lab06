package org.example;

public class CreditsComparator implements Comparable<Course>{

    public int compareTo(Course c1, Course c2) {
        return Integer.compare(c1.getCredits(), c2.getCredits());
    }
}

