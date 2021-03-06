package epam.training.universityproblem;

public class University {
    private final String name;
    private Faculty[] faculties;

    public University(String name, Faculty[] faculties) {
        this.name = name;

        setFaculties(faculties);
    }

    public String getName() {
        return name;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }


    public void setFaculties(Faculty[] faculties) {

        /*throwing an exception if no faculties included*/
        if (faculties != null && faculties.length == 0) {
            throw new RuntimeException("University: " + this.getName() + " has not any faculty!!!");
        }
        this.faculties = faculties;
    }

}
