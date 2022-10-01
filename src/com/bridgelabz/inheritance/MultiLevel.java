package com.bridgelabz.inheritance;

public class MultiLevel extends Application2{

    void circle(){
        System.out.println("Its a circle");
    }
    @Override
    void disp() {
        super.disp();
        System.out.println("First super class ");
    }

    public static void main(String[] args) {
        MultiLevel m = new MultiLevel();
        m.disp();
        m.shape();
        m.circle();
    }
}
