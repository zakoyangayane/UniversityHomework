package epam.training.universityproblem;

import epam.training.universityproblem.exceptions.GroupWithNullStudentsException;
import epam.training.universityproblem.exceptions.MarkOutOfBoundsException;
import epam.training.universityproblem.exceptions.StudentWithNullSubjectsException;
import epam.training.universityproblem.services.AverageMarkCalculator;

public class Group {
    public String name;
    private Student[] students;
    private Subject[] subjects;

    public Group(String name, Student[] students, Subject[] subjects) {
        this.name = name;

        setStudents(students);
        setSubjects(subjects);

        this.students = students;
        this.subjects = subjects;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {

        /*throwing an exception if no students included*/
        if (students.length == 0) {
            throw new GroupWithNullStudentsException();
        }
        this.students = students;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {

        /*throwing an exception if no subjects mentioned for the students*/
        if (subjects.length == 0) {
            throw new StudentWithNullSubjectsException();
        }
        this.subjects = subjects;
    }

    public void setMarksForSubject(int[] marks, Subject subject) {

        /*throwing an exception if mark is not between 0 and 10*/
        for (int m : marks) {
            if ((m < 0) || (m > 10)) {
                throw new MarkOutOfBoundsException();
            }
        }
        double avg = AverageMarkCalculator.averageMark(marks);
        System.out.println("Average mark of group <" + name + "> from " + subject.getName() +
                " is " + avg);
    }
}
