package org.example;
import java.util.Comparator;

public class CreditsComparator implements Comparator<Course>{

    @Override
    public int compare(Course c1, Course c2) {
        return Integer.compare(c1.getCredits(), c2.getCredits());
    }
}

