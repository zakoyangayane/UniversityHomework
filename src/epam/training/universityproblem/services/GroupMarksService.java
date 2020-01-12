package epam.training.universityproblem.services;

public class GroupMarksService {
    GroupService groupService = new GroupService();
    StudentsMarksService studentsMarksService = new StudentsMarksService();
    SubjectsService subjectsService = new SubjectsService();

    /*first group marks for single subjects*/
    public int[] firstGroupMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent1FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent2FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent3FromMaths);
        return mathsMarks;
    }

    public int[] firstGroupEnglishMarks() {
        int[] englishMarks = new int[0];
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent1FromEnglish);
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent2FromEnglish);
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent3FromEnglish);
        return englishMarks;
    }

    public int[] firstGroupGermanMarks() {
        int[] germanMarks = new int[0];
        germanMarks = AverageMarkCalculator.getAllMarks(germanMarks,
                studentsMarksService.marksForStudent1FromGerman);
        germanMarks = AverageMarkCalculator.getAllMarks(germanMarks,
                studentsMarksService.marksForStudent2FromGerman);
        germanMarks = AverageMarkCalculator.getAllMarks(germanMarks,
                studentsMarksService.marksForStudent3FromGerman);
        return germanMarks;
    }

    public int[] firstGroupCppMarks() {
        int[] cppMarks = new int[0];
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent1FromCpp);
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent2FromCpp);
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent3FromCpp);
        return cppMarks;
    }

    public int[] firstGroupRussianMarks() {
        int[] russianMarks = new int[0];
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent1FromRussian);
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent2FromRussian);
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent3FromRussian);
        return russianMarks;
    }

    /*second group marks for single subjects*/
    public int[] secondGroupEnglishMarks() {
        int[] englishMarks = new int[0];
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent4FromEnglish);
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent5FromEnglish);
        englishMarks = AverageMarkCalculator.getAllMarks(englishMarks,
                studentsMarksService.marksForStudent6FromEnglish);
        return englishMarks;
    }

    public int[] secondGroupHistoryMarks() {
        int[] historyMarks = new int[0];
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent4FromHistory);
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent5FromHistory);
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent6FromHistory);
        return historyMarks;
    }

    public int[] secondGroupLinearAlgebraMarks() {
        int[] linearAlgebraMarks = new int[0];
        linearAlgebraMarks = AverageMarkCalculator.getAllMarks(linearAlgebraMarks,
                studentsMarksService.marksForStudent4FromLinearAlgebra);
        linearAlgebraMarks = AverageMarkCalculator.getAllMarks(linearAlgebraMarks,
                studentsMarksService.marksForStudent5FromLinearAlgebra);
        linearAlgebraMarks = AverageMarkCalculator.getAllMarks(linearAlgebraMarks,
                studentsMarksService.marksForStudent6FromLinearAlgebra);
        return linearAlgebraMarks;
    }

    public int[] secondGroupRussianMarks() {
        int[] russianMarks = new int[0];
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent4FromRussian);
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent5FromRussian);
        russianMarks = AverageMarkCalculator.getAllMarks(russianMarks,
                studentsMarksService.marksForStudent6FromRussian);
        return russianMarks;
    }

    /*third group marks for single subjects*/
    public int[] thirdGroupMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent7FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent8FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent9FromMaths);
        return mathsMarks;
    }

    public int[] thirdGroupPhilosophyMarks() {
        int[] philosophyMarks = new int[0];
        philosophyMarks = AverageMarkCalculator.getAllMarks(philosophyMarks,
                studentsMarksService.marksForStudent7FromPhilosophy);
        philosophyMarks = AverageMarkCalculator.getAllMarks(philosophyMarks,
                studentsMarksService.marksForStudent8FromPhilosophy);
        philosophyMarks = AverageMarkCalculator.getAllMarks(philosophyMarks,
                studentsMarksService.marksForStudent9FromPhilosophy);
        return philosophyMarks;
    }

    public int[] thirdGroupHistoryMarks() {
        int[] historyMarks = new int[0];
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent7FromHistory);
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent8FromHistory);
        historyMarks = AverageMarkCalculator.getAllMarks(historyMarks,
                studentsMarksService.marksForStudent9FromHistory);
        return historyMarks;
    }

    /*fourth group marks for single subjects*/
    public int[] fourthGroupMathsMarks() {
        int[] mathsMarks = new int[0];
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent10FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent11FromMaths);
        mathsMarks = AverageMarkCalculator.getAllMarks(mathsMarks,
                studentsMarksService.marksForStudent12FromMaths);
        return mathsMarks;
    }

    public int[] fourthGroupCppMarks() {
        int[] cppMarks = new int[0];
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent10FromCpp);
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent11FromCpp);
        cppMarks = AverageMarkCalculator.getAllMarks(cppMarks,
                studentsMarksService.marksForStudent12FromCpp);
        return cppMarks;
    }

    public int[] fourthGroupArmenianMarks() {
        int[] armenianMarks = new int[0];
        armenianMarks = AverageMarkCalculator.getAllMarks(armenianMarks,
                studentsMarksService.marksForStudent10FromArmenian);
        armenianMarks = AverageMarkCalculator.getAllMarks(armenianMarks,
                studentsMarksService.marksForStudent11FromArmenian);
        armenianMarks = AverageMarkCalculator.getAllMarks(armenianMarks,
                studentsMarksService.marksForStudent12FromArmenian);
        return armenianMarks;
    }

    /*calling the function for calculating the average grade of the groups from every subject*/
    public void getAverageMarkForFirstGroupForCurrentSubject() {
        GroupMarksService groupMarksService = new GroupMarksService();
        System.out.println("----------Group First-----------");
        groupService.firstGroup.setMarksForSubject(groupMarksService.firstGroupMathsMarks(),
                subjectsService.maths);
        groupService.firstGroup.setMarksForSubject(groupMarksService.firstGroupEnglishMarks(),
                subjectsService.english);
        groupService.firstGroup.setMarksForSubject(groupMarksService.firstGroupGermanMarks(),
                subjectsService.german);
        groupService.firstGroup.setMarksForSubject(groupMarksService.firstGroupCppMarks(),
                subjectsService.cpp);
        groupService.firstGroup.setMarksForSubject(groupMarksService.firstGroupRussianMarks(),
                subjectsService.russian);
        System.out.println();
    }

    public void getAverageMarkForSecondGroupForCurrentSubject() {
        GroupMarksService groupMarksService = new GroupMarksService();
        System.out.println("----------Group Second-----------");
        groupService.secondGroup.setMarksForSubject(groupMarksService.secondGroupEnglishMarks(),
                subjectsService.english);
        groupService.secondGroup.setMarksForSubject(groupMarksService.secondGroupHistoryMarks(),
                subjectsService.history);
        groupService.secondGroup.setMarksForSubject(groupMarksService.secondGroupLinearAlgebraMarks(),
                subjectsService.linearAlgebra);
        groupService.secondGroup.setMarksForSubject(groupMarksService.secondGroupRussianMarks(),
                subjectsService.russian);
        System.out.println();
    }

    public void getAverageMarkForThirdGroupForCurrentSubject() {
        GroupMarksService groupMarksService = new GroupMarksService();
        System.out.println("----------Group Third-----------");
        groupService.thirdGroup.setMarksForSubject(groupMarksService.thirdGroupMathsMarks(),
                subjectsService.maths);
        groupService.thirdGroup.setMarksForSubject(groupMarksService.thirdGroupPhilosophyMarks(),
                subjectsService.philosophy);
        groupService.thirdGroup.setMarksForSubject(groupMarksService.thirdGroupHistoryMarks(),
                subjectsService.history);
        System.out.println();
    }

    public void getAverageMarkForFourthGroupForCurrentSubject() {
        GroupMarksService groupMarksService = new GroupMarksService();
        System.out.println("----------Group Fourth-----------");
        groupService.fourthGroup.setMarksForSubject(groupMarksService.fourthGroupMathsMarks(),
                subjectsService.maths);
        groupService.fourthGroup.setMarksForSubject(groupMarksService.fourthGroupCppMarks(),
                subjectsService.cpp);
        groupService.fourthGroup.setMarksForSubject(groupMarksService.fourthGroupArmenianMarks(),
                subjectsService.armenian);
        System.out.println();
    }
}
