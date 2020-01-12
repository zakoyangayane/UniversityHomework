package epam.training.universityproblem.services;

import epam.training.universityproblem.University;

public class UniversityService {
    FacultyService facultyService = new FacultyService();

    /*make university object*/
    University yerevan_state_university = new University("Yerevan State University",
            facultyService.faculties);
}
