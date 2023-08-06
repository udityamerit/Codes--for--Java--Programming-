package com.company;
class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x ){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

}
class Derived extends Base {
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class _45_OOPs_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(7);
        System.out.println((b.getX()));

        Derived d = new Derived();
        d.setX(20);
        System.out.println((d.getX()));
        d.setY(30);
        System.out.println(d.getY());

    }
}
