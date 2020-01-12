package epam.training.universityproblem.exceptions;

public class FacultyWithNullGroupsException extends RuntimeException {
    @Override
    public String toString() {
        return "Faculty has not any group!!!";
    }
}
