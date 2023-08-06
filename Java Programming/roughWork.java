package com.company;
// Multilevel Inheritance in java
class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Dog{
    void fly(){
        System.out.println("I am flying");
    }
}
public class roughWork {
    public static void main(String[] args) {
        Bird b = new Bird();
        System.out.print("Dog ");
        b.eat();
        System.out.print("Dog ");
        b.walk();
        System.out.print("Bird ");
        b.fly();
    }
}
