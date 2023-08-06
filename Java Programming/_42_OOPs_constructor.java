package com.company;

class work{
    private String name;
    private int id;

//getters and setters
    public String getName(){
        return name;
    }
    public void setName(String n ){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void getId(int i ){
       id = i;
    }

    //make a constructor
      public work(String myname , int myid){
        name = myname;
        id = myid;
    }
    public work(){
        name = "aman";
        id = 23;
    }
}
public class _42_OOPs_constructor {
    public static void main(String[] args) {

        work w1 = new work("Anuj",23);
        work w2 = new work("Uditya",332);
        work w3 = new work();
//        System.out.println(w1.name + w2.name);
//        System.out.println("first object: " + w1.name + " and id is: " + w1.id);
        System.out.println(w3.getName() + w3.getId());
        System.out.println(w1.getName());
        System.out.println(w2.getId());
    }
}
