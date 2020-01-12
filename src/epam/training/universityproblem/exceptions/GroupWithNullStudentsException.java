package epam.training.universityproblem.exceptions;

public class GroupWithNullStudentsException extends RuntimeException {
    @Override
    public String toString() {
        return "Group has not any student!!!";
    }
}
