package com.bridgelabz.inheritance;

public class Application2 extends SmartPhone{
    void shape(){
        System.out.println("Its a rectangle");
    }

    public static void main(String[] args) {
        Application2 a = new Application2();
        a.disp();
    }
    }
