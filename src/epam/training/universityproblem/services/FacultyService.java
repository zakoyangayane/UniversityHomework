package epam.training.universityproblem.services;

import epam.training.universityproblem.Faculty;

public class FacultyService {
    GroupService groupService = new GroupService();

    /*making faculties with group arrays*/
    Faculty applied_mathematics_and_informatics = new Faculty("Applied mathematics and informatics",
            groupService.facultyFirst);
    Faculty computer_science = new Faculty("Computer Science",
            groupService.facultySecond);

    Faculty[] faculties = {applied_mathematics_and_informatics, computer_science};
}
