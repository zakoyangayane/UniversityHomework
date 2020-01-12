package epam.training.universityproblem.exceptions;

public class MarkOutOfBoundsException extends RuntimeException {
    @Override
    public String toString() {
        return "Mark must be from 0 to 10!!!";
    }
}
