package com.company;

//this class is responsible
// for keeping track of students'
// fees, name, grade and fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student( int id, String name, int grade) {

      this.feesPaid = 0;
      this.feesTotal = 30000;
      this.id = id;
      this.name = name;
      this.grade = grade;
    }

    //not going to alter student's name, id
    // no need for setter

    //we will alter: student's grade


    public void setGrade(int grade) {
        this.grade = grade;
    }
}


