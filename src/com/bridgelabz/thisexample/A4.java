package com.bridgelabz.thisexample;
/*this: to pass as argument in the constructor call*/
class B1{
    A4 obj;
    B1(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}

public class A4{
    int data=10;
    A4(){
        B1 b=new B1(this);
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }
}