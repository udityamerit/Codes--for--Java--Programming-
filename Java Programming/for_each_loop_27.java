package com.company;

public class for_each_loop_27 {
    public static void main(String[] args) {
        int [] marks = {34,56,23,45,6,7};
//        System.out.println(marks [2]);
//        System.out.println(marks.length);
        
        System.out.println("array using for loop");
        for( int i=0; i<marks.length;i++){
            System.out.println(marks[i]);}

        System.out.println("array in reverse order");
        for( int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
