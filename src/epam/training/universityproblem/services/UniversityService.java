package epam.training.universityproblem.services;

import epam.training.universityproblem.Subject;
import epam.training.universityproblem.University;

public class UniversityService {
    FacultyService facultyService = new FacultyService();
    SubjectsService subjectsService = new SubjectsService();

    /*make university object*/
    University yerevan_state_university = new University("Yerevan State University",
            facultyService.faculties);

    /*getting marks and subjects of university, adding the marks of the students of university
    from the same subject in a dynamic array, then calling the average
    counting function for each of the subject*/
    public void countAverageForUniversity(University university) {
        facultyService.groupService.studentsService.setStudentGrades();
        double avg;
        Subject subjectName = null;
        for (int i = 0; i < subjectsService.allSubjects.length; i++) {
            int[] allStudentMarks = new int[0];
            for (int j = 0; j < university.getFaculties().length; j++) {
                for (int k = 0; k < university.getFaculties()[j].getGroups().length; k++) {
                    for (int l = 0; l < university.getFaculties()[j].getGroups()[k].
                            getStudents().length; l++) {
                        for (int m = 0; m < university.getFaculties()[j].getGroups()[k].
                                getStudents()[l].getSubjects().length; m++) {
                            if (university.getFaculties()[j].getGroups()[k].getStudents()[l].
                                    getSubjects()[m].getName().equals(subjectsService.allSubjects[i].getName())) {
                                subjectName = university.getFaculties()[j].
                                        getGroups()[k].getStudents()[l].getSubjects()[m];
                                allStudentMarks = AverageMarkCalculator.getAllMarks(allStudentMarks,
                                        university.getFaculties()[j].getGroups()[k].
                                                getStudents()[l].getGrade(subjectName));
                            }
                        }
                    }
                }
            }
            if (allStudentMarks.length != 0) {
                avg = AverageMarkCalculator.averageMark(allStudentMarks);
                System.out.println("Average mark of <" + university.getName() + "> from " +
                        subjectName.getName() + " is " + avg);
            }
        }
        System.out.println("---------------------");
    }

    /*getting average marks of university for single subjects, by calling
    countAverageForUniversity method*/
    public void getAverageOfUniversityForCurrentSubject() {
        countAverageForUniversity(yerevan_state_university);
    }
}
