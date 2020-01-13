package epam.training.universityproblem;

import epam.training.universityproblem.exceptions.MarkOutOfBoundsException;
import epam.training.universityproblem.exceptions.UniversityWithNullFacultiesException;
import epam.training.universityproblem.services.AverageMarkCalculator;

public class University {
    private String name;
    private Faculty[] faculties;

    public University(String name, Faculty[] faculties) {
        this.name = name;

        setFaculties(faculties);
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }


    public void setFaculties(Faculty[] faculties) {

        /*throwing an exception if no faculties included*/
        if (faculties.length == 0) {
            throw new UniversityWithNullFacultiesException();
        }
        this.faculties = faculties;
    }

    public void setMarksForSubject(int[] marks, Subject subject) {

        /*throwing an exception if mark is not between 0 and 10*/
        for (int m : marks) {
            if ((m < 0) || (m > 10)) {
                throw new MarkOutOfBoundsException();
            }
        }
        double avg = AverageMarkCalculator.averageMark(marks);
        System.out.println("Average mark of <" + name + "> from " + subject.getName() +
                " is " + avg);
    }
}
