package epam.training.universityproblem.services;

import epam.training.universityproblem.Group;

public class GroupService {
    SubjectsService subjectsService = new SubjectsService();
    StudentsService studentsService = new StudentsService();

    /*making groups with students array and subjects array*/
    Group firstGroup = new Group("Group1", studentsService.groupFirstStudents,
            subjectsService.groupFirstSubjects);
    Group secondGroup = new Group("Group2", studentsService.groupSecondStudents,
            subjectsService.groupSecondSubjects);
    Group thirdGroup = new Group("Group3", studentsService.groupThirdStudents,
            subjectsService.groupThirdSubjects);
    Group fourthGroup = new Group("Group4", studentsService.groupFourthStudents,
            subjectsService.groupFourthSubjects);

    /*making group arrays*/
    Group[] facultyFirst = {firstGroup, secondGroup};
    Group[] facultySecond = {thirdGroup, fourthGroup};
}
