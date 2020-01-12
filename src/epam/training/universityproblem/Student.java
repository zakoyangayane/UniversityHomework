package epam.training.universityproblem;

import epam.training.universityproblem.exceptions.MarkOutOfBoundsException;
import epam.training.universityproblem.services.AverageMarkCalculator;

public class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setMarksForSubject(int[] marks, Subject subject) {

        /*throwing an exception if mark is not between 0 and 10*/
        for (int m : marks) {
            if ((m < 0) || (m > 10)) {
                throw new MarkOutOfBoundsException();
            }
        }
        double avg = AverageMarkCalculator.averageMark(marks);
        System.out.println("Average mark of " + firstName + " " + lastName +
                " from " + subject.getName() + " is " + avg);
    }
}
