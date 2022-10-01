package com.bridgelabz.Encapsulation;

public class Student1 {
    private String college = "SAIT";

    public String getCollege() {
        return college;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println("My college name is:\n" + s1.getCollege());
    }
}