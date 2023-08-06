package com.company;
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x is:"+ x );
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);  // it is used to call the constructor which hava an argument:

        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor with value of y is:"+ y );
    }
}
public class _46_OOPs_constructor_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
        Derived1 d= new Derived1(23,45);
    }
}
