package com.company;

public class Java_Method_Overloading_32 {
    static void foo(){ // This is considered as a function 1:
        System.out.println("Good morning bro!");
    }
    static void foo(int a ){// This is considered as a function 2:
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a ,int b ){// This is considered as a function 3:
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a ){// This is considered as a function 4:
        a = 45;
    }
    static void change2(int [] arr){// This is considered as a function 5:
        arr[0] = 45;
    }
    static void tellJoke(){// This is considered as a function 6 :
        System.out.println("I have invented the new world");
    }
    public static void main(String[] args) {
        //tellJoke();
        //case 1: changing an int value
        int x = 23;
        change(x);
        //System.out.println("The value of the x after the changing is:"+ x);

        //case 2: changing an Array
        int [] marks = { 54,23,64,34};
        change2(marks);
        //System.out.println("The value of marks array at index 0 is: " + marks[0]);



        //Method overloading==>

        foo(); //This is work as the calling of a function 1:
        foo(3000);//This is work as the calling of a function 2:
        foo(3000,4000);//This is work as the calling of a function 3:

    }
}
