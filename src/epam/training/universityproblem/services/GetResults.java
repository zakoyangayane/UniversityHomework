package epam.training.universityproblem.services;

public class GetResults {
    StudentsService studentsService = new StudentsService();
    GroupService groupService = new GroupService();
    FacultyService facultyService = new FacultyService();
    UniversityService universityService = new UniversityService();

    public void getAverageMarkResults() {
        System.out.println("Student's average grades");
        System.out.println("-------------------------");
        /*printing all student's average grades from all subjects*/
        studentsService.getAverageOfStudentForCurrentSubject();

        System.out.println("Average grades of groups");
        System.out.println("-------------------------");
        /*printing average grades from all subject of all groups*/
        groupService.getAverageOfGroupForCurrentSubject();

        System.out.println("Average grades of faculties");
        System.out.println("----------------------------");
        /*printing average grades from all subjects of all faculties*/
        facultyService.getAverageOfFacultiesForCurrentSubject();

        System.out.println("Average grades of university");
        System.out.println("-----------------------------");
        /*printing average grades from all subjects of university*/
        universityService.getAverageOfUniversityForCurrentSubject();

    }
}