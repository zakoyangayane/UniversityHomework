package epam.training.universityproblem.services;

import epam.training.universityproblem.Group;
import epam.training.universityproblem.Student;
import epam.training.universityproblem.Subject;

public class GroupService {
    StudentsService studentsService = new StudentsService();
    SubjectsService subjectsService = new SubjectsService();

    /*making groups with students array and subjects array*/
    Group firstGroup = new Group("Group1", studentsService.groupFirstStudents);
    Group secondGroup = new Group("Group2", studentsService.groupSecondStudents);
    Group thirdGroup = new Group("Group3", studentsService.groupThirdStudents);
    Group fourthGroup = new Group("Group4", studentsService.groupFourthStudents);

    /*making group arrays*/
    Group[] facultyFirst = {firstGroup, secondGroup};
    Group[] facultySecond = {thirdGroup, fourthGroup};

    /*getting marks and subjects of groups, adding the marks of the students of the
    same group from the same subject in a dynamic array, then calling the average
    counting function for each of the subject*/
    public void countAverageForGroups(Group group) {
        studentsService.setStudentGrades();
        double avg;
        Subject subjectName = null;
        for (int i = 0; i < subjectsService.allSubjects.length; i++) {
            int[] allStudentMarks = new int[0];
            for (int j = 0; j < group.getStudents().length; j++) {
                Student[] studentsData = group.getStudents();
                for (int k = 0; k < studentsData[j].getSubjects().length; k++) {
                    Subject[] subjectsData = studentsData[j].getSubjects();
                    if (subjectsData[k].getName().
                            equals(subjectsService.allSubjects[i].getName())) {
                        subjectName = subjectsData[k];
                        allStudentMarks = AverageMarkCalculator.getAllMarks(allStudentMarks,
                                studentsData[j].getGrade(subjectName));
                    }
                }
            }
            if (allStudentMarks.length != 0) {
                avg = AverageMarkCalculator.averageMark(allStudentMarks);
                System.out.println("Average mark of " + group.getName() + " from " +
                        subjectName.getName() + " is " + avg);
            }
        }
        System.out.println("---------------------");
    }

    /*getting average marks of groups for single subjects, by calling
    countAverageForGroups method*/
    public void getAverageOfGroupForCurrentSubject() {
        countAverageForGroups(firstGroup);
        countAverageForGroups(secondGroup);
        countAverageForGroups(thirdGroup);
        countAverageForGroups(fourthGroup);
    }

}
