public class inherit {
    public static void main(String args[]){

        // Inheritance 
        // Car C1 = new Car("Toyota" , "Corrola" , "Red" , 4);
        // C1.getData(1);
        // C1.start("Toyota");
        // Car C2 = new Car("Honda" , "City" , "White" , 4);
        // C2.getData(2);
        // C2.start("Toyota");
        // Car C3 = new Car("Suzuki" , "Alto" , "Blue" , 4);
        // C3.getData(3);
        // C3.start("Toyota");

        // // POLYMORPHISM
        // Calculator Cal1 = new Calculator();
        // System.out.println(Cal1.sum(2,3));
        // System.out.println(Cal1.sum((float)2.0,(float)3.0));
        // System.out.println(Cal1.sum(2,(float)4.0));

        // // Method Overriding 
        // Dog D1 = new Dog();
        // D1.sound();
    }
}

// Parrent Class 
class Vehicle {
    String Color;
    int Wheels;

    void start(String name){
        System.out.println(name + " : Is Started!");
    }

    void stop(String name){
        System.out.println(name + " : Is Stopped!");
    }
}

// Single-level Inheritance 
class landVehicle extends Vehicle {

    void drive() {
        System.out.println("Drive It..!");
    }

    void park() {
        System.out.println("Park It..!");
    }
}

// Multi-level Inheritance 
class Car extends landVehicle {
    String Brand;
    String Model;

    Car(String Brand , String Model , String Color , int Wheels) {
        this.Brand = Brand;
        this.Model = Model;
        this.Color = Color;
        this.Wheels = Wheels;
    }

    void getData(int num) {
        System.out.print("("+num+")_ Brand  : " + this.Brand + " | ");
        System.out.print("Model  : " + this.Model + " | ");
        System.out.print("Color  : " + this.Color + " | ");
        System.out.print("Wheels : " + this.Wheels+ " | ");
    }
}

// Hiararchial Inheritance 
class Bike extends landVehicle{
    void Race() {
        System.out.println("Start Bike For the Race!!!");
    }
}

// Multiple Inheritance 
class AirVehicles extends Vehicle {
    void fly () {
        System.out.println("Fly It..!");
    }

    void land () {
        System.out.println("Land It..!");
    }
}

class Calculator {

    int sum(int a , int b) {
        return a+b;
    }

    float sum(float a , float b) {
        return a+b;
    }

    float sum(int a , float b){
        return a+b;
    }
}

// Method Over-riding 
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}