package epam.training.universityproblem;

public class Group {
    public final String name;
    private Student[] students;

    public Group(String name, Student[] students) {
        this.name = name;

        setStudents(students);
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {

        /*throwing an exception if no students included*/
        if (students.length == 0) {
            throw new RuntimeException("Group: " + this.getName() + " has not any student!!!");
        }
        this.students = students;
    }

}
