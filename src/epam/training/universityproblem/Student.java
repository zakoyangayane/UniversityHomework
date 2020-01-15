package epam.training.universityproblem;

public class Student {
    String firstName;
    String lastName;
    private Subject[] subjects;
    private Grade[] subjectGrades;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    /*set subjects for a student*/
    public void setSubjects(Subject[] subjects) {

        /*throwing an exception if no subjects mentioned for the students*/
        if (subjects.length == 0) {
            throw new RuntimeException("No Subject mentioned for this student!!!");
        }
        this.subjects = subjects;
    }

    /*set grades for a student for a current subject*/
    public void setGrade(Grade grade) {

        /*throwing an exception if mark is not between 0 and 10*/
        for (int m : grade.getGrades()) {
            if ((m < 0) || (m > 10)) {
                throw new RuntimeException("Mark must be from 0 to 10!!!");
            }
        }

        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(grade.getSubject())) {
                this.subjectGrades = setAllGrades(this.subjectGrades, grade);
            }
        }
    }

    /*add dynamically to the subjectGrades field all the grades with their subjects for
    a current student*/
    public Grade[] setAllGrades(Grade[] allSubjectsWithTheirGrades, Grade currentSubjectWithItsGrades) {
        Grade[] newArray;
        if (allSubjectsWithTheirGrades != null) {
            newArray = new Grade[allSubjectsWithTheirGrades.length + 1];
            for (int i = 0; i < allSubjectsWithTheirGrades.length; i++) {
                newArray[i] = allSubjectsWithTheirGrades[i];
            }
            newArray[newArray.length - 1] = currentSubjectWithItsGrades;
        } else {
            newArray = new Grade[1];
            newArray[0] = currentSubjectWithItsGrades;
        }
        return newArray;
    }

    /*get grades from a current subject of a current student*/
    public int[] getGrade(Subject subject) {

        /*go through all his subjects (which have grades connected to them) to see if the student
        has that subject in his list, then return that grades of that subject*/
        for (int i = 0; i < this.subjectGrades.length; i++) {
            if (this.subjectGrades[i].getSubject().equals(subject)) {
                return this.subjectGrades[i].getGrades();
            }
        }
        return new int[]{0};
    }

}
