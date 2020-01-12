package epam.training.universityproblem.services;

import epam.training.universityproblem.Subject;

public class SubjectsService {

    /*making subject objects*/
    Subject cpp = new Subject("cpp");
    Subject philosophy = new Subject("philosophy");
    Subject maths = new Subject("maths");
    Subject english = new Subject("english");
    Subject armenian = new Subject("armenian");
    Subject russian = new Subject("russian");
    Subject german = new Subject("german");
    Subject history = new Subject("history");
    Subject linearAlgebra = new Subject("linearAlgebra");

    /*making subject arrays for single groups*/
    Subject[] groupFirstSubjects = {maths, english, german, cpp, russian};
    Subject[] groupSecondSubjects = {english, history, linearAlgebra, russian};
    Subject[] groupThirdSubjects = {maths, philosophy, history};
    Subject[] groupFourthSubjects = {maths, cpp, armenian};
}
