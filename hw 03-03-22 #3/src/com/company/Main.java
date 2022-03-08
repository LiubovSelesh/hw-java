package com.company;

public class Main {

    public static void main(String[] args) {
// 3. Do you remember the tasks about students and grades?
// Try to create the class or classes those ft best for this task

        Subject subject1 = new Subject();
        subject1.math = 12;
        subject1.literature = 10;

        Subject subject2 = new Subject();
        subject2.math = 12;
        subject2.literature = 10;

        Student student1 = new Student();
        student1.name = "Vivien";
        student1.klass = "5 class";
        student1.progress = subject1;

        Student student2 = new Student();
        student2.name = "Liya";
        student2.klass = "8 class";
        student2.progress = subject2;
        printProgressOfStudent(student1);
        printProgressOfStudent(student2);


    }
    public static void printProgressOfStudent(Student student){
        System.out.println("Student: " + student.name + " ("+ student.klass + "), " +
                "Her progress in Maths is " + student.progress.math + " point" + " end in Literature " + student.progress.literature + " point");
        System.out.println();
    }
}
