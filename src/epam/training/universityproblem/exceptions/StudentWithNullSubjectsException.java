package epam.training.universityproblem.exceptions;

public class StudentWithNullSubjectsException extends RuntimeException {
    @Override
    public String toString() {
        return "No Subject mentioned for this student!!!";
    }
}
