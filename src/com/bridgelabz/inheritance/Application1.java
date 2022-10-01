package com.bridgelabz.inheritance;

public class Application1 extends SmartPhone {
    public static void main(String[] args) {
        Application1 a = new Application1();
        a.disp();
    }
}


class SmartPhone{
   void disp(){
        System.out.println("Smart phone is cheap");
    }
}