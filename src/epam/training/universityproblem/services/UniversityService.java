package epam.training.universityproblem.services;

import epam.training.universityproblem.*;

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
                Faculty[] facultiesData = university.getFaculties();
                for (int k = 0; k < facultiesData[j].getGroups().length; k++) {
                    Group[] groupsData = facultiesData[j].getGroups();
                    for (int l = 0; l < groupsData[k].getStudents().length; l++) {
                        Student[] studentsData = groupsData[k].getStudents();
                        for (int m = 0; m < studentsData[l].getSubjects().length; m++) {
                            Subject[] subjectsData = studentsData[l].getSubjects();
                            if (subjectsData[m].getName().
                                    equals(subjectsService.allSubjects[i].getName())) {
                                subjectName = subjectsData[m];
                                allStudentMarks = AverageMarkCalculator.getAllMarks(allStudentMarks,
                                        studentsData[l].getGrade(subjectName));
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
