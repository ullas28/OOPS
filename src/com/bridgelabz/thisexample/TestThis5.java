package com.bridgelabz.thisexample;
/*this() : to invoke current class constructor*/
public class TestThis5 {
        public static void main(String args[]){
            B a=new B(10);
        }
}

class B {
    B() {
        System.out.println("hello a");
    }

    B(int x) {
        this();
        System.out.println(x);
    }
}