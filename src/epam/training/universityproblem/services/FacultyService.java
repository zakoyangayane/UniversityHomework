package epam.training.universityproblem.services;

import epam.training.universityproblem.Faculty;
import epam.training.universityproblem.Group;
import epam.training.universityproblem.Student;
import epam.training.universityproblem.Subject;

public class FacultyService {
    GroupService groupService = new GroupService();
    SubjectsService subjectsService = new SubjectsService();

    /*making faculties with group arrays*/
    Faculty applied_mathematics_and_informatics = new Faculty("Applied mathematics and informatics",
            groupService.facultyFirst);
    Faculty computer_science = new Faculty("Computer Science",
            groupService.facultySecond);

    Faculty[] faculties = {applied_mathematics_and_informatics, computer_science};

    /*getting marks and subjects of faculties, adding the marks of the students of the
    same faculty from the same subject in a dynamic array, then calling the average
    counting function for each of the subject*/
    public void countAverageForFaculties(Faculty faculty) {
        groupService.studentsService.setStudentGrades();
        double avg;
        Subject subjectName = null;
        for (int i = 0; i < subjectsService.allSubjects.length; i++) {
            int[] allStudentMarks = new int[0];
            for (int j = 0; j < faculty.getGroups().length; j++) {
                Group[] groupsData = faculty.getGroups();
                for (int k = 0; k < groupsData[j].getStudents().length; k++) {
                    Student[] studentsData = groupsData[j].getStudents();
                    for (int l = 0; l < studentsData[k].getSubjects().length; l++) {
                        Subject[] subjectsData = studentsData[k].getSubjects();
                        if (subjectsData[l].getName().
                                equals(subjectsService.allSubjects[i].getName())) {
                            subjectName = subjectsData[l];
                            allStudentMarks = AverageMarkCalculator.getAllMarks(allStudentMarks,
                                    studentsData[k].getGrade(subjectName));
                        }
                    }
                }
            }
            if (allStudentMarks.length != 0) {
                avg = AverageMarkCalculator.averageMark(allStudentMarks);
                System.out.println("Average mark of faculty <" + faculty.getName() + "> from " +
                        subjectName.getName() + " is " + avg);
            }
        }
        System.out.println("---------------------");
    }


    /*getting average marks of faculties for single subjects, by calling
    countAverageForFaculties method*/
    public void getAverageOfFacultiesForCurrentSubject() {
        countAverageForFaculties(applied_mathematics_and_informatics);
        countAverageForFaculties(computer_science);
    }
}
