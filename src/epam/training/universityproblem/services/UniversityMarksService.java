package epam.training.universityproblem.services;

public class UniversityMarksService {
    SubjectsService subjectsService = new SubjectsService();
    FacultyMarksService facultyMarksService = new FacultyMarksService();
    UniversityService universityService = new UniversityService();

    public int[] getUniversityCppMarks() {
        int[] cppMarks = new int[0];
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                facultyMarksService.getFirstFacultyCppMarks());
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                facultyMarksService.getSecondFacultyCppMarks());
        return cppMarks;
    }

    public int[] getUniversityPhilosophyMarks() {
        int[] philosophyMarks = new int[0];
        philosophyMarks = AverageMarkCalculator.getAllMarks(philosophyMarks,
                facultyMarksService.getSecondFacultyPhilosophyMarks());
        return philosophyMarks;
    }

    public int[] getUniversityMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                facultyMarksService.getFirstFacultyMathsMarks());
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                facultyMarksService.getSecondFacultyMathsMarks());
        return mathsMarks;
    }

    public int[] getUniversityEnglishMarks() {
        int[] englishMarks = new int[0];
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                facultyMarksService.getFirstFacultyEnglishMarks());
        return englishMarks;
    }

    public int[] getUniversityArmenianMarks() {
        int[] armenianMarks = new int[0];
        armenianMarks = AverageMarkCalculator.getAllMarks(armenianMarks,
                facultyMarksService.getSecondFacultyArmenianMarks());
        return armenianMarks;
    }

    public int[] getUniversityRussianMarks() {
        int[] russianMarks = new int[0];
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                facultyMarksService.getFirstFacultyRussianMarks());
        return russianMarks;
    }

    public int[] getUniversityGermanMarks() {
        int[] germanMarks = new int[0];
        germanMarks = AverageMarkCalculator.getAllMarks(germanMarks,
                facultyMarksService.getFirstFacultyGermanMarks());
        return germanMarks;
    }

    public int[] getUniversityHistoryMarks() {
        int[] historyMarks = new int[0];
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                facultyMarksService.getFirstFacultyHistoryMarks());
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                facultyMarksService.getSecondFacultyHistoryMarks());
        return historyMarks;
    }

    public int[] getUniversityLinearAlgebraMarks() {
        int[] linearAlgebraMarks = new int[0];
        linearAlgebraMarks = AverageMarkCalculator.getAllMarks(linearAlgebraMarks,
                facultyMarksService.getFirstFacultyLinearAlgebraMarks());
        return linearAlgebraMarks;
    }

    /*calling the function for calculating the average grade of the university from every subject*/
    public void getAverageMarkForUniversityForCurrentSubject() {
        UniversityMarksService universityMarksService = new UniversityMarksService();
        System.out.println("----------<Yerevan State University>-----------");
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityCppMarks(), subjectsService.cpp);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityPhilosophyMarks(), subjectsService.philosophy);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityMathsMarks(), subjectsService.maths);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityEnglishMarks(), subjectsService.english);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityArmenianMarks(), subjectsService.armenian);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityRussianMarks(), subjectsService.russian);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityGermanMarks(), subjectsService.german);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityHistoryMarks(), subjectsService.history);
        universityService.yerevan_state_university.setMarksForSubject
                (universityMarksService.getUniversityLinearAlgebraMarks(), subjectsService.linearAlgebra);
        System.out.println();
    }
}
