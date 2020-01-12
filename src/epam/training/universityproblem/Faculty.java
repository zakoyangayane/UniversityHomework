package epam.training.universityproblem;

import epam.training.universityproblem.exceptions.FacultyWithNullGroupsException;
import epam.training.universityproblem.exceptions.MarkOutOfBoundsException;
import epam.training.universityproblem.services.AverageMarkCalculator;

public class Faculty {
    private String name;
    private Group[] groups;

    public Faculty(String name, Group[] groups) {
        this.name = name;

        /*throwing an exception if no groups included*/
        if (groups.length == 0) {
            throw new FacultyWithNullGroupsException();
        }
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {

        /*throwing an exception if no groups included*/
        if (groups.length == 0) {
            throw new FacultyWithNullGroupsException();
        }
        this.groups = groups;
    }

    public void setMarksForSubject(int[] marks, Subject subject) {

        /*throwing an exception if mark is not between 0 and 10*/
        for (int m : marks) {
            if ((m < 0) || (m > 10)) {
                throw new MarkOutOfBoundsException();
            }
        }
        double avg = AverageMarkCalculator.averageMark(marks);
        System.out.println("Average mark of faculty <" + name + "> from " + subject.getName() +
                " is " + avg);
    }
}
