package com.company;

class  student{
    int id;
    String name;
    public void d(){ // this class is act as a template
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
}
public class _38_OOPs_make_a_class {
    public static void main(String[] args) {
        student har = new student(); //   Instantiating a new student object
        student j = new student();//   Instantiating a new student object

// setting the attributes or properties
        har.id = 2;
        har.name = "anuj";
        j.id = 3;
        j.name = "jhon the don";


//        System.out.println(har.id);

        har.d();
         j.d();

    }
}
