package epam.training.universityproblem;

import epam.training.universityproblem.exceptions.FacultyWithNullGroupsException;

public class Faculty {
    private String name;
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
            throw new FacultyWithNullGroupsException();
        }
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

}
