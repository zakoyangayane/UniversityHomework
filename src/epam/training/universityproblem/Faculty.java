package epam.training.universityproblem;

public class Faculty {
    private final String name;
    private Group[] groups;

    public Faculty(String name, Group[] groups) {
        this.name = name;

        setGroups(groups);
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {

        /*throwing an exception if no groups included*/
        if (groups.length == 0) {
            throw new RuntimeException("Faculty: " + this.getName() + " has not any group!!!");
        }
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

}
