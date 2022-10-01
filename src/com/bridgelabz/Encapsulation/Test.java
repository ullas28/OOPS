package com.bridgelabz.Encapsulation;

public class Test{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Ullas");
        System.out.println("My name is:\n" + s.getName());
    }
}
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}