package com.bridgelabz.thisexample;
/*this keyword can be used to return current class instance*/
public class Test1 {
    static class A{
        @Override
        public String toString() {
            return "A{" +
                    "Name='" + Name + '\'' +
                    '}';
        }

        String Name = "Ullas";
    A getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}

        public static void main(String args[]){
           A d =  new A();
            System.out.println(d);
            System.out.println(d.getA());
            d.msg();
            new A().getA().msg();
        }
    }

