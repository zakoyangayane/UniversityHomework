package epam.training.universityproblem.services;

import epam.training.universityproblem.Grade;
import epam.training.universityproblem.Student;
import epam.training.universityproblem.Subject;

public class StudentsService {
    SubjectsService subjectsService = new SubjectsService();

    /*creating Student objects*/
    Student student1 = new Student("Armen", "Hovhannisyan");
    Student student2 = new Student("Anna", "Azizyan");
    Student student3 = new Student("Aram", "Baghdasaryan");
    Student student4 = new Student("Ella", "Sargsyan");
    Student student5 = new Student("Arman", "Saryan");
    Student student6 = new Student("Ara", "Sargsyan");
    Student student7 = new Student("Gayane", "Zakoyan");
    Student student8 = new Student("Ani", "Araqelyan");
    Student student9 = new Student("Naira", "Mnacakanyan");
    Student student10 = new Student("Vazgen", "Xachatryan");
    Student student11 = new Student("Arsen", "Saryan");
    Student student12 = new Student("Vika", "Mazmanyan");

    /*making groups of students*/
    Student[] groupFirstStudents = {student1, student2, student3};
    Student[] groupSecondStudents = {student4, student5, student6};
    Student[] groupThirdStudents = {student7, student8, student9};
    Student[] groupFourthStudents = {student10, student11, student12};

    /*setting subjects for every student*/
    public void setSubjectsForStudents() {
        student1.setSubjects(new Subject[]{subjectsService.armenian,
                subjectsService.linearAlgebra, subjectsService.english});
        student2.setSubjects(new Subject[]{subjectsService.russian,
                subjectsService.linearAlgebra, subjectsService.english});
        student3.setSubjects(new Subject[]{subjectsService.russian,
                subjectsService.cpp, subjectsService.armenian});
        student4.setSubjects(new Subject[]{subjectsService.armenian,
                subjectsService.history, subjectsService.cpp});
        student5.setSubjects(new Subject[]{subjectsService.maths,
                subjectsService.history, subjectsService.german});
        student6.setSubjects(new Subject[]{subjectsService.maths,
                subjectsService.german, subjectsService.english});
        student7.setSubjects(new Subject[]{subjectsService.philosophy, subjectsService.maths});
        student8.setSubjects(new Subject[]{subjectsService.cpp, subjectsService.maths});
        student9.setSubjects(new Subject[]{subjectsService.philosophy, subjectsService.linearAlgebra});
        student10.setSubjects(new Subject[]{subjectsService.german, subjectsService.cpp});
        student11.setSubjects(new Subject[]{subjectsService.armenian,
                subjectsService.history, subjectsService.cpp});
        student12.setSubjects(new Subject[]{subjectsService.history,
                subjectsService.german, subjectsService.maths});
    }


    /*setting grades for every student from their subjects*/
    public void setStudentGrades() {
        setSubjectsForStudents();
        student1.setGrade(new Grade(new int[]{4, 7, 9}, subjectsService.armenian));
        student1.setGrade(new Grade(new int[]{4, 5, 6}, subjectsService.linearAlgebra));
        student1.setGrade(new Grade(new int[]{9, 8, 8}, subjectsService.english));

        student2.setGrade(new Grade(new int[]{3, 7, 7}, subjectsService.russian));
        student2.setGrade(new Grade(new int[]{5, 5, 6}, subjectsService.linearAlgebra));
        student2.setGrade(new Grade(new int[]{7, 8, 9}, subjectsService.english));

        student3.setGrade(new Grade(new int[]{4, 5, 6}, subjectsService.russian));
        student3.setGrade(new Grade(new int[]{4, 4, 8}, subjectsService.cpp));
        student3.setGrade(new Grade(new int[]{7, 9, 9}, subjectsService.armenian));

        student4.setGrade(new Grade(new int[]{5, 5, 8}, subjectsService.armenian));
        student4.setGrade(new Grade(new int[]{7, 5, 7}, subjectsService.history));
        student4.setGrade(new Grade(new int[]{9, 8, 10}, subjectsService.cpp));

        student5.setGrade(new Grade(new int[]{8, 5, 9}, subjectsService.maths));
        student5.setGrade(new Grade(new int[]{7, 5, 8}, subjectsService.history));
        student5.setGrade(new Grade(new int[]{6, 5, 6}, subjectsService.german));

        student6.setGrade(new Grade(new int[]{8, 7, 6}, subjectsService.maths));
        student6.setGrade(new Grade(new int[]{7, 9, 9}, subjectsService.german));
        student6.setGrade(new Grade(new int[]{4, 7, 7}, subjectsService.english));

        student7.setGrade(new Grade(new int[]{8, 8, 9}, subjectsService.philosophy));
        student7.setGrade(new Grade(new int[]{7, 5, 7}, subjectsService.maths));

        student8.setGrade(new Grade(new int[]{9, 9, 9}, subjectsService.cpp));
        student8.setGrade(new Grade(new int[]{6, 8, 7}, subjectsService.maths));

        student9.setGrade(new Grade(new int[]{7, 8, 9}, subjectsService.philosophy));
        student9.setGrade(new Grade(new int[]{4, 5, 6}, subjectsService.linearAlgebra));

        student10.setGrade(new Grade(new int[]{9, 8, 10}, subjectsService.german));
        student10.setGrade(new Grade(new int[]{8, 8, 6}, subjectsService.cpp));

        student11.setGrade(new Grade(new int[]{7, 5, 7}, subjectsService.armenian));
        student11.setGrade(new Grade(new int[]{5, 5, 5}, subjectsService.history));
        student11.setGrade(new Grade(new int[]{7, 8, 6}, subjectsService.cpp));

        student12.setGrade(new Grade(new int[]{10, 9, 8}, subjectsService.history));
        student12.setGrade(new Grade(new int[]{7, 5, 6}, subjectsService.german));
        student12.setGrade(new Grade(new int[]{4, 8, 6}, subjectsService.maths));
    }

    /*getting marks and subjects of students, then calling the average
    counting function for each of them*/
    public void countAverageForStudents(Student student) {
        setStudentGrades();
        double avg = 0;
        for (int i = 0; i < student.getSubjects().length; i++) {
            int[] currentSubjectGrades = student.getGrade(student.getSubjects()[i]);
            avg = AverageMarkCalculator.averageMark(currentSubjectGrades);
            System.out.println("Average mark of " + student.getFirstName() + " " +
                    student.getLastName() + " from " + student.getSubjects()[i].getName() +
                    " is " + avg);
        }
        System.out.println("---------------------");
    }

    /*getting average marks of students for single subjects, by calling
    countAverageForStudents method*/
    public void getAverageOfStudentForCurrentSubject() {
        countAverageForStudents(student1);
        countAverageForStudents(student2);
        countAverageForStudents(student3);
        countAverageForStudents(student4);
        countAverageForStudents(student5);
        countAverageForStudents(student6);
        countAverageForStudents(student7);
        countAverageForStudents(student8);
        countAverageForStudents(student9);
        countAverageForStudents(student10);
        countAverageForStudents(student11);
        countAverageForStudents(student12);
    }
}
