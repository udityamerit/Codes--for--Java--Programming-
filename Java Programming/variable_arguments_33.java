package com.company;

public class variable_arguments_33 {
    static int sum(int...arr){
        int result = 0;
        for(int a: arr){
            result = result+a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println("hello world");
        System.out.println("the sum of 3,4,5,6,7,8,and 20 is: "+sum(3,4,5,6,7,8,20));

    }
}
