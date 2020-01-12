package epam.training.universityproblem.exceptions;

public class UniversityWithNullFacultiesException extends RuntimeException {
    @Override
    public String toString() {
        return "University has not any faculty!!!";
    }
}
