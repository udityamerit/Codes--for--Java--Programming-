package com.company;

public class Arrays_26 {
    public static void main(String[] args) {
        /* Classroom of 500 students you have to store marks of these 500 students
        * You have two options :
        * 1. Create 500 variables
        * 2. use of arrays */
//        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 34;
//        marks[2] = 10;
//        System.out.println(marks[2]);
        //another way to make an array
//        int [] marks = {34,56,23,45,6,7};
//        System.out.println(marks[4]);

        //you can make any type of array: eg--> int ,float,string; L-27
//        int [] marks = {34,56,23,45,6,7};
//        float [] ank = {34.3f,56.3f,23.6f,45.9f,67.1f};
//        String [] student = {"ram","rohan","ramesh","mahesh"};
//        System.out.println(student.length);
//        System.out.println(student[3]);

        // Printing the array using For loop
        int [] marks = {34,56,23,45,6,7};
        for (int i=0;i<=marks.length;i++){
        System.out.println(marks[i]);}

    }
}
