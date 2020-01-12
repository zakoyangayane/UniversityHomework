package epam.training.universityproblem.services;

public class StudentsMarksService {
    StudentsService studentsService = new StudentsService();
    SubjectsService subjectsService = new SubjectsService();

    /*setting marks for students from firstGroup*/
    /*marks for student1*/
    int[] marksForStudent1FromMaths = {5, 3, 6, 7, 8};
    int[] marksForStudent1FromEnglish = {4, 5, 6, 5, 7};
    int[] marksForStudent1FromGerman = {8, 9, 9};
    int[] marksForStudent1FromCpp = {8, 5, 7};
    int[] marksForStudent1FromRussian = {9, 8};

    /*marks for student2*/
    int[] marksForStudent2FromMaths = {9, 8, 6, 7};
    int[] marksForStudent2FromEnglish = {9, 9, 8, 4};
    int[] marksForStudent2FromGerman = {6, 7, 5, 9};
    int[] marksForStudent2FromCpp = {7, 7, 8, 9};
    int[] marksForStudent2FromRussian = {3, 3, 4, 5};

    /*marks for student3*/
    int[] marksForStudent3FromMaths = {6, 7, 5, 9, 5};
    int[] marksForStudent3FromEnglish = {6, 9, 4, 6};
    int[] marksForStudent3FromGerman = {7, 7, 8, 5};
    int[] marksForStudent3FromCpp = {9, 7, 8, 6};
    int[] marksForStudent3FromRussian = {6, 4, 5, 6};


    /*setting marks for students from secondGroup*/
    /*marks for student4*/
    int[] marksForStudent4FromEnglish = {5, 6, 8, 9};
    int[] marksForStudent4FromHistory = {7, 7, 7, 8};
    int[] marksForStudent4FromLinearAlgebra = {9, 4, 5, 6, 5};
    int[] marksForStudent4FromRussian = {7, 9, 5, 6};

    /*marks for student5*/
    int[] marksForStudent5FromEnglish = {6, 6, 7};
    int[] marksForStudent5FromHistory = {8, 8, 9, 5, 6};
    int[] marksForStudent5FromLinearAlgebra = {7, 6};
    int[] marksForStudent5FromRussian = {7, 8, 8};

    /*marks for student6*/
    int[] marksForStudent6FromEnglish = {9, 8, 7};
    int[] marksForStudent6FromHistory = {9, 9, 7};
    int[] marksForStudent6FromLinearAlgebra = {4, 4, 5, 6};
    int[] marksForStudent6FromRussian = {7, 7, 8, 9, 9};


    /*setting marks for students from thirdGroup*/
    /*marks for student7*/
    int[] marksForStudent7FromMaths = {9, 9, 8};
    int[] marksForStudent7FromPhilosophy = {8, 7, 6, 8};
    int[] marksForStudent7FromHistory = {9, 7, 8};

    /*marks for student8*/
    int[] marksForStudent8FromMaths = {8, 7, 9};
    int[] marksForStudent8FromPhilosophy = {5, 6};
    int[] marksForStudent8FromHistory = {7, 6, 5};

    /*marks for student9*/
    int[] marksForStudent9FromMaths = {8, 7, 8, 6};
    int[] marksForStudent9FromPhilosophy = {9, 8, 8};
    int[] marksForStudent9FromHistory = {6, 5};


    /*setting marks for students from fourthGroup*/
    /*marks for student10*/
    int[] marksForStudent10FromMaths = {7, 8, 8, 8, 7};
    int[] marksForStudent10FromCpp = {9, 9, 8, 7, 9};
    int[] marksForStudent10FromArmenian = {8, 8, 7};

    /*marks for student11*/
    int[] marksForStudent11FromMaths = {6, 6, 5, 4};
    int[] marksForStudent11FromCpp = {4, 4, 5, 6};
    int[] marksForStudent11FromArmenian = {9, 9, 8};

    /*marks for student12*/
    int[] marksForStudent12FromMaths = {7, 7, 5};
    int[] marksForStudent12FromCpp = {7, 5, 7};
    int[] marksForStudent12FromArmenian = {9, 5, 6, 8, 7};


    /*calling the function for calculating the average grade of every student from every subject*/
    public void getAverageMarkForFirstGroupCurrentStudentForCurrentSubject() {
        System.out.println("---------------First Group Students marks----------------");

        studentsService.student1.setMarksForSubject(marksForStudent1FromMaths, subjectsService.maths);
        studentsService.student1.setMarksForSubject(marksForStudent1FromEnglish, subjectsService.english);
        studentsService.student1.setMarksForSubject(marksForStudent1FromGerman, subjectsService.german);
        studentsService.student1.setMarksForSubject(marksForStudent1FromCpp, subjectsService.cpp);
        studentsService.student1.setMarksForSubject(marksForStudent1FromRussian, subjectsService.russian);
        System.out.println();

        studentsService.student2.setMarksForSubject(marksForStudent2FromMaths, subjectsService.maths);
        studentsService.student2.setMarksForSubject(marksForStudent2FromEnglish, subjectsService.english);
        studentsService.student2.setMarksForSubject(marksForStudent2FromGerman, subjectsService.german);
        studentsService.student2.setMarksForSubject(marksForStudent2FromCpp, subjectsService.cpp);
        studentsService.student2.setMarksForSubject(marksForStudent2FromRussian, subjectsService.russian);
        System.out.println();

        studentsService.student3.setMarksForSubject(marksForStudent3FromMaths, subjectsService.maths);
        studentsService.student3.setMarksForSubject(marksForStudent3FromEnglish, subjectsService.english);
        studentsService.student3.setMarksForSubject(marksForStudent3FromGerman, subjectsService.german);
        studentsService.student3.setMarksForSubject(marksForStudent3FromCpp, subjectsService.cpp);
        studentsService.student3.setMarksForSubject(marksForStudent3FromRussian, subjectsService.russian);
        System.out.println();
    }

    public void getAverageMarkForSecondGroupCurrentStudentForCurrentSubject() {
        System.out.println("---------------Second Group Students marks----------------");
        studentsService.student4.setMarksForSubject(marksForStudent4FromEnglish, subjectsService.english);
        studentsService.student4.setMarksForSubject(marksForStudent4FromHistory, subjectsService.history);
        studentsService.student4.setMarksForSubject(marksForStudent4FromLinearAlgebra, subjectsService.linearAlgebra);
        studentsService.student4.setMarksForSubject(marksForStudent4FromRussian, subjectsService.russian);
        System.out.println();

        studentsService.student5.setMarksForSubject(marksForStudent5FromEnglish, subjectsService.english);
        studentsService.student5.setMarksForSubject(marksForStudent5FromHistory, subjectsService.history);
        studentsService.student5.setMarksForSubject(marksForStudent5FromLinearAlgebra, subjectsService.linearAlgebra);
        studentsService.student5.setMarksForSubject(marksForStudent5FromRussian, subjectsService.russian);
        System.out.println();

        studentsService.student6.setMarksForSubject(marksForStudent6FromEnglish, subjectsService.english);
        studentsService.student6.setMarksForSubject(marksForStudent6FromHistory, subjectsService.history);
        studentsService.student6.setMarksForSubject(marksForStudent6FromLinearAlgebra, subjectsService.linearAlgebra);
        studentsService.student6.setMarksForSubject(marksForStudent6FromRussian, subjectsService.russian);
        System.out.println();
    }

    public void getAverageMarkForThirdGroupCurrentStudentForCurrentSubject() {
        System.out.println("---------------Third Group Students marks----------------");
        studentsService.student7.setMarksForSubject(marksForStudent7FromMaths, subjectsService.maths);
        studentsService.student7.setMarksForSubject(marksForStudent7FromPhilosophy, subjectsService.philosophy);
        studentsService.student7.setMarksForSubject(marksForStudent7FromHistory, subjectsService.history);
        System.out.println();

        studentsService.student8.setMarksForSubject(marksForStudent8FromMaths, subjectsService.maths);
        studentsService.student8.setMarksForSubject(marksForStudent8FromPhilosophy, subjectsService.philosophy);
        studentsService.student8.setMarksForSubject(marksForStudent8FromHistory, subjectsService.history);
        System.out.println();

        studentsService.student9.setMarksForSubject(marksForStudent9FromMaths, subjectsService.maths);
        studentsService.student9.setMarksForSubject(marksForStudent9FromPhilosophy, subjectsService.philosophy);
        studentsService.student9.setMarksForSubject(marksForStudent9FromHistory, subjectsService.history);
        System.out.println();
    }

    public void getAverageMarkForFourthGroupCurrentStudentForCurrentSubject() {
        System.out.println("---------------Fourth Group Students marks----------------");
        studentsService.student10.setMarksForSubject(marksForStudent10FromMaths, subjectsService.maths);
        studentsService.student10.setMarksForSubject(marksForStudent10FromCpp, subjectsService.cpp);
        studentsService.student10.setMarksForSubject(marksForStudent10FromArmenian, subjectsService.armenian);
        System.out.println();

        studentsService.student11.setMarksForSubject(marksForStudent11FromMaths, subjectsService.maths);
        studentsService.student11.setMarksForSubject(marksForStudent11FromCpp, subjectsService.cpp);
        studentsService.student11.setMarksForSubject(marksForStudent11FromArmenian, subjectsService.armenian);
        System.out.println();

        studentsService.student12.setMarksForSubject(marksForStudent12FromMaths, subjectsService.maths);
        studentsService.student12.setMarksForSubject(marksForStudent12FromCpp, subjectsService.cpp);
        studentsService.student12.setMarksForSubject(marksForStudent12FromArmenian, subjectsService.armenian);
        System.out.println();
    }
}
