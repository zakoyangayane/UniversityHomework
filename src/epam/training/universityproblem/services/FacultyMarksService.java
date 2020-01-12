package epam.training.universityproblem.services;

public class FacultyMarksService {
    FacultyService facultyService = new FacultyService();
    GroupMarksService groupMarksService = new GroupMarksService();
    SubjectsService subjectsService = new SubjectsService();

    /*first faculty marks for single subjects*/
    public int[] getFirstFacultyMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                groupMarksService.firstGroupMathsMarks());
        return mathsMarks;
    }

    public int[] getFirstFacultyEnglishMarks() {
        int[] englishMarks = new int[0];
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                groupMarksService.firstGroupEnglishMarks());
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                groupMarksService.secondGroupEnglishMarks());
        return englishMarks;
    }

    public int[] getFirstFacultyGermanMarks() {
        int[] germanMarks = new int[0];
        germanMarks = AverageMarkCalculator.getAllMarks(germanMarks,
                groupMarksService.firstGroupGermanMarks());
        return germanMarks;
    }

    public int[] getFirstFacultyCppMarks() {
        int[] cppMarks = new int[0];
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                groupMarksService.firstGroupCppMarks());
        return cppMarks;
    }

    public int[] getFirstFacultyRussianMarks() {
        int[] russianMarks = new int[0];
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                groupMarksService.firstGroupRussianMarks());
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                groupMarksService.secondGroupRussianMarks());
        return russianMarks;
    }

    public int[] getFirstFacultyHistoryMarks() {
        int[] historyMarks = new int[0];
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                groupMarksService.secondGroupHistoryMarks());
        return historyMarks;
    }

    public int[] getFirstFacultyLinearAlgebraMarks() {
        int[] linearAlgebraMarks = new int[0];
        linearAlgebraMarks = AverageMarkCalculator.getAllMarks(linearAlgebraMarks,
                groupMarksService.secondGroupLinearAlgebraMarks());
        return linearAlgebraMarks;
    }

    /*second faculty marks for single subjects*/
    public int[] getSecondFacultyMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                groupMarksService.thirdGroupMathsMarks());
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                groupMarksService.fourthGroupMathsMarks());
        return mathsMarks;
    }

    public int[] getSecondFacultyPhilosophyMarks() {
        int[] philosophyMarks = new int[0];
        philosophyMarks = AverageMarkCalculator.getAllMarks(philosophyMarks,
                groupMarksService.thirdGroupPhilosophyMarks());
        return philosophyMarks;
    }

    public int[] getSecondFacultyHistoryMarks() {
        int[] historyMarks = new int[0];
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                groupMarksService.thirdGroupHistoryMarks());
        return historyMarks;
    }

    public int[] getSecondFacultyCppMarks() {
        int[] cppMarks = new int[0];
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                groupMarksService.fourthGroupCppMarks());
        return cppMarks;
    }

    public int[] getSecondFacultyArmenianMarks() {
        int[] armenianMarks = new int[0];
        armenianMarks = AverageMarkCalculator.getAllMarks(armenianMarks,
                groupMarksService.fourthGroupArmenianMarks());
        return armenianMarks;
    }

    /*calling the function for calculating the average grade of the faculties from every subject*/
    public void getAverageMarkForFirstFacultyForCurrentSubject() {
        FacultyMarksService facultyMarksService = new FacultyMarksService();
        System.out.println("----------Faculty <Applied Mathematics and Informatics>-----------");
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyMathsMarks(), subjectsService.maths);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyEnglishMarks(), subjectsService.english);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyGermanMarks(), subjectsService.german);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyCppMarks(), subjectsService.cpp);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyRussianMarks(), subjectsService.russian);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyHistoryMarks(), subjectsService.history);
        facultyService.applied_mathematics_and_informatics.setMarksForSubject
                (facultyMarksService.getFirstFacultyLinearAlgebraMarks(), subjectsService.linearAlgebra);
        System.out.println();
    }

    public void getAverageMarkForSecondFacultyForCurrentSubject() {
        FacultyMarksService facultyMarksService = new FacultyMarksService();
        System.out.println("----------Faculty <Computer science>-----------");
        facultyService.computer_science.setMarksForSubject
                (facultyMarksService.getSecondFacultyMathsMarks(), subjectsService.maths);
        facultyService.computer_science.setMarksForSubject
                (facultyMarksService.getSecondFacultyPhilosophyMarks(), subjectsService.philosophy);
        facultyService.computer_science.setMarksForSubject
                (facultyMarksService.getSecondFacultyHistoryMarks(), subjectsService.history);
        facultyService.computer_science.setMarksForSubject
                (facultyMarksService.getSecondFacultyCppMarks(), subjectsService.cpp);
        facultyService.computer_science.setMarksForSubject
                (facultyMarksService.getSecondFacultyArmenianMarks(), subjectsService.armenian);
        System.out.println();
    }
}
