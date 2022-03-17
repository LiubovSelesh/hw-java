package com.company;
////1.Write a program by creating an "Employee" class having the following methods and print the final salary.
//    //- constructor which accepts the salary, numbers of employee's working hours per day as parameters
//    //- 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
//    //- "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
//    //more than 6 hours

public class Employee {
    private int salary;
    private int hours;

    public Employee(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public void addSalary() {
        if (this.salary < 500)
          this.salary += 10;
    }

    public void addWork(){
        if (this.hours > 6)
            this.salary+=5;

    }

    public int getSalary() {
        addSalary();
        addWork();
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(400, 8);
        System.out.println(employee.getSalary());
    }
}
