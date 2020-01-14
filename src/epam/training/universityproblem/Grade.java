package epam.training.universityproblem;

public class Grade {
    private int[] grades;
    private Subject subject;

    public Grade(int[] grades, Subject subject) {
        this.grades = grades;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
