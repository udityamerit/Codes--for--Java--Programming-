package com.company;

class MyWork{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public void setId(int i) {
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class _40_OOPs_access_modi_Constructor {
    public static void main(String[] args) {
        MyWork anuj = new MyWork();
        anuj.setId(34);
        anuj.setName("Uditya");
        System.out.println(anuj.getId());
        System.out.println(anuj.getName());

    }
}
