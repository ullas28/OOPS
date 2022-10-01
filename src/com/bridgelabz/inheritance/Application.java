package com.bridgelabz.inheritance;

 class Car extends Factory {

    public void brand() {

        System.out.println("Tesla");
    }

}


 class Factory {

    public void design() {

        System.out.println("Design the car");
    }

    public void build() {

        System.out.println("Build the car");
    }
}

 public class Application {

    public static void main(String[] args) {


        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand();

    }

}