package com.company;

public class Practice {
    String subject;
    Person trainee;
    Person tutor;
    MyDate dateStart;
    MyDate dateFinish;

    public Practice(String subject, Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish) {
        this.subject = subject;
        this.trainee = trainee;
        this.tutor = tutor;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
    }

    public String toString() {
        return "Subject: " + subject +
                "\nTrainee: " + trainee.toString() +
                "\nTutor: " + tutor.toString() +
                "\nStart date: " + dateStart.toString() +
                "\nFinish date: " + dateFinish.toString();
    }
}