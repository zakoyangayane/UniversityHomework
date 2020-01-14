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
        student1.setGrade(new Grade(new int[]{4, 7, 9}, student1.getSubjects()[0]));
        student1.setGrade(new Grade(new int[]{4, 5, 6}, student1.getSubjects()[1]));
        student1.setGrade(new Grade(new int[]{9, 8, 8}, student1.getSubjects()[2]));

        student2.setGrade(new Grade(new int[]{3, 7, 7}, student2.getSubjects()[0]));
        student2.setGrade(new Grade(new int[]{5, 5, 6}, student2.getSubjects()[1]));
        student2.setGrade(new Grade(new int[]{7, 8, 9}, student2.getSubjects()[2]));

        student3.setGrade(new Grade(new int[]{4, 5, 6}, student3.getSubjects()[0]));
        student3.setGrade(new Grade(new int[]{4, 4, 8}, student3.getSubjects()[1]));
        student3.setGrade(new Grade(new int[]{7, 9, 9}, student3.getSubjects()[2]));

        student4.setGrade(new Grade(new int[]{5, 5, 8}, student4.getSubjects()[0]));
        student4.setGrade(new Grade(new int[]{7, 5, 7}, student4.getSubjects()[1]));
        student4.setGrade(new Grade(new int[]{9, 8, 10}, student4.getSubjects()[2]));

        student5.setGrade(new Grade(new int[]{8, 5, 9}, student5.getSubjects()[0]));
        student5.setGrade(new Grade(new int[]{7, 5, 8}, student5.getSubjects()[1]));
        student5.setGrade(new Grade(new int[]{6, 5, 6}, student5.getSubjects()[2]));

        student6.setGrade(new Grade(new int[]{8, 7, 6}, student6.getSubjects()[0]));
        student6.setGrade(new Grade(new int[]{7, 9, 9}, student6.getSubjects()[1]));
        student6.setGrade(new Grade(new int[]{4, 7, 7}, student6.getSubjects()[2]));

        student7.setGrade(new Grade(new int[]{8, 8, 9}, student7.getSubjects()[0]));
        student7.setGrade(new Grade(new int[]{7, 5, 7}, student7.getSubjects()[1]));

        student8.setGrade(new Grade(new int[]{9, 9, 9}, student8.getSubjects()[0]));
        student8.setGrade(new Grade(new int[]{6, 8, 7}, student8.getSubjects()[1]));

        student9.setGrade(new Grade(new int[]{7, 8, 9}, student9.getSubjects()[0]));
        student9.setGrade(new Grade(new int[]{4, 5, 6}, student9.getSubjects()[1]));

        student10.setGrade(new Grade(new int[]{9, 8, 10}, student10.getSubjects()[0]));
        student10.setGrade(new Grade(new int[]{8, 8, 6}, student10.getSubjects()[1]));

        student11.setGrade(new Grade(new int[]{7, 5, 7}, student11.getSubjects()[0]));
        student11.setGrade(new Grade(new int[]{5, 5, 5}, student11.getSubjects()[1]));
        student11.setGrade(new Grade(new int[]{7, 8, 6}, student11.getSubjects()[2]));

        student12.setGrade(new Grade(new int[]{10, 9, 8}, student12.getSubjects()[0]));
        student12.setGrade(new Grade(new int[]{7, 5, 6}, student12.getSubjects()[1]));
        student12.setGrade(new Grade(new int[]{4, 8, 6}, student12.getSubjects()[2]));
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
