package com.company;

public class Data {
    int day;
    int month;
    int year;

    public Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void  MyData(){
        System.out.println(day + "-" + month +  "-" + year);
    }
}


//“21-15-2022”