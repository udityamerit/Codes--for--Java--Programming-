package com.company;
class MyMainWork{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
     }

    public int getId(){
        return id;
    }
    public void setId(int i) {
        id = i;
    }
}
public class _42_OOPs_constractor_getter_setter {
    public static void main(String[] args) {

        MyMainWork uditya = new MyMainWork();
        uditya.setName("uditya Narayan");
        uditya.setId(34);
        System.out.println(uditya.getName());
        System.out.println(uditya.getId());
    }
}
