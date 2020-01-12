package epam.training.universityproblem.services;

public class GetResults {
    StudentsMarksService studentsMarksService = new StudentsMarksService();
    GroupMarksService groupMarksService = new GroupMarksService();
    FacultyMarksService facultyMarksService = new FacultyMarksService();
    UniversityMarksService universityMarksService = new UniversityMarksService();

    public void getAverageMarkResults() {

        /*getting average marks for first group students from current subject*/
        studentsMarksService.getAverageMarkForFirstGroupCurrentStudentForCurrentSubject();
        /*getting average marks for second group students from current subject*/
        studentsMarksService.getAverageMarkForSecondGroupCurrentStudentForCurrentSubject();
        /*getting average marks for third group students from current subject*/
        studentsMarksService.getAverageMarkForThirdGroupCurrentStudentForCurrentSubject();
        /*getting average marks for fourth group students from current subject*/
        studentsMarksService.getAverageMarkForFourthGroupCurrentStudentForCurrentSubject();


        /*getting average marks for first group from current subject*/
        groupMarksService.getAverageMarkForFirstGroupForCurrentSubject();
        /*getting average marks for second group from current subject*/
        groupMarksService.getAverageMarkForSecondGroupForCurrentSubject();
        /*getting average marks for third group from current subject*/
        groupMarksService.getAverageMarkForThirdGroupForCurrentSubject();
        /*getting average marks for fourth group from current subject*/
        groupMarksService.getAverageMarkForFourthGroupForCurrentSubject();


        /*getting average marks for first faculty from current subject*/
        facultyMarksService.getAverageMarkForFirstFacultyForCurrentSubject();
        /*getting average marks for second faculty from current subject*/
        facultyMarksService.getAverageMarkForSecondFacultyForCurrentSubject();


        /*getting average marks for university from current subject*/
        universityMarksService.getAverageMarkForUniversityForCurrentSubject();
    }
}