public class Abstraction {

    public static void main(String args[]) {
        // // Abstraction and Abtract Classes
        // Dog D1 = new Dog();
        // D1.eat("Dog");
        // D1.Voice();
        // D1.walk_By();

        // // Abstraction by Interfaces 
        // Easypaisa EP1 = new Easypaisa();
        // EP1.makePayment(10000);
        // EP1.getPaymentStatus();

        // CreditCard CP1 = new CreditCard();
        // CP1.makePayment(20000);
        // CP1.getPaymentStatus();

        // BankTransfer BP1 = new BankTransfer();
        // BP1.makePayment(30000);
        // BP1.getPaymentStatus();

        // // Multiple Inheritance
        // Bear B1 = new Bear();
        // B1.Herbi_Eat();
        // B1.carni_Eat();

        // Static Keyword 
        Student S1 = new Student();
        S1.setData("Muhammad Shayan", 6259);
        S1.School_name = "GPS Sarwani..!!";
        S1.getData();

        System.out.println();
        Student S2 = new Student();
        S2.setData("Muhammad Ayan  ", 6260);
        S2.getData();

    }
}

abstract class Animal {

    Animal(){
        System.out.println("1)_Animal Constructor..!!");
    }

    void eat(String animal){
        System.out.println(animal + " Can Eat...!");
    }

    abstract void walk_By();

    abstract void Voice();
}

class Dog extends Animal {
    String animal = "Dog";
    Dog(){
        System.out.println("2)_Dog Constructor..!!");
    }

    void walk_By(){
        System.out.println(animal + " Walk by four Legs..!");
    }

    void Voice(){
        System.out.println(animal + " Voice Is Bark..!");
    }

}

class Cat extends Animal {
    String animal = "Cat";
    Cat(){
        System.out.println("3)_Cat Constructor..!!");
    }

    void walk_By(){
        System.out.println(animal + " Walk by four Legs..!");
    }

    void Voice(){
        System.out.println(animal + " Voice Is Meow..!");
    }

}

// INTERFACES IN JAVA
interface Payment {
    void makePayment(double Debited);
    void refundPayment(double Credited);
    void getPaymentStatus();
}

class Easypaisa implements Payment {
    Easypaisa(){
        System.out.println("\nEasyPaisa Payment Details : ");
    }
    public void makePayment(double Debited){
        System.out.println("Transferred : " + Debited);
    }

    public void refundPayment(double Credited){
        System.out.println("Remitted : " + Credited);
    }

    public void getPaymentStatus(){
        System.out.println("Payment Status : Successfull" );
    }
}

class BankTransfer implements Payment {
    BankTransfer(){
        System.out.println("\nBank Payment Details : ");
    }
    public void makePayment(double Debited){
        System.out.println("Transferred : " + Debited);
    }

    public void refundPayment(double Credited){
        System.out.println("Remitted : " + Credited);
    }

    public void getPaymentStatus(){
        System.out.println("Payment Status : Successfull" );
    }
}

class CreditCard implements Payment {
    CreditCard(){
        System.out.println("\nCredit Card Payment Details : ");
    }
    public void makePayment(double Debited){
        System.out.println("Transferred : " + Debited);
    }

    public void refundPayment(double Credited){
        System.out.println("Remitted : " + Credited);
    }

    public void getPaymentStatus(){
        System.out.println("Payment Status : Successfull" );
    }
}

// Multiple Inheritance

interface Herbivores {
    void Herbi_Eat();
}

interface Carnivores {
    void carni_Eat();
}

class Bear implements Herbivores , Carnivores {
    public void Herbi_Eat(){
        System.out.println("... Can Eat Plants and Vegetables..!!");
    }
    public void carni_Eat(){
        System.out.println("... Can Eat Meat..!!");
    }
}

// STATIC-KEYWORD

class Student {
    String name;
    int Rno;
    static String School_name;

    void setData(String name , int Rno) {
        this.name = name;
        this.Rno = Rno;
    }

    void getData(){
        System.out.print("Name Of Student : " + this.name + " | ");
        System.out.print("Roll number : " + this.Rno + " | ");
        System.out.print("School : " + School_name);
    }
}