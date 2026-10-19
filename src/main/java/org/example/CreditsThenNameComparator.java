package org.example;

public class CreditsThenNameComparator implements Comparable<Course>{

    public int compareTo(Course c1, Course c2) {
        int creditComparison = Integer.compare(c1.getCredits(), c2.getCredits());

        if (creditComparison != 0) {
            return creditComparison;
        }

        return c1.getName().compareTo(c2.getName());
    }
}

