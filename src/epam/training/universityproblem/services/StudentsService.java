package epam.training.universityproblem.services;

import epam.training.universityproblem.Student;

public class StudentsService {

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

}
