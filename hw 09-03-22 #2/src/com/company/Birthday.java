package com.company;

public class Birthday {
    int day;
    int month;
    int year;

    public Birthday(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return this.day+"-"+this.month+"-"+this.year;
    }
}
