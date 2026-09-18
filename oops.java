public class oops {

    public static void main(String args[]){
        Student S1 = new Student();
        // Before Updation 
        S1.setData("Muhammad Shayan", 21 , 6259, 3.78);
        System.out.println("\nBefore : ");
        S1.printData();

        // After Updation 
        System.out.println("\nAfter : ");
        S1.Name = "M Shayan";
        S1.Age = 22;
        S1.Rno = 6260;
        S1.Cgpa = 3.80;
        S1.printData();

        // CAR CLASS INFO-- 
        Car C1 = new Car();
        Car C2 = new Car();
        Car C3 = new Car();
        C1.setData("Toyota", "Corola", 2022 , 4500000);
        C1.getData();
        C2.setData("Honda", "Civic", 2021, 5500000);
        C2.getData();
        C3.setData("Suzuki", "Swift", 2021, 3200000);
        C3.getData();
    }
}

class Student {
    // Constructor 
    Student(){
        System.out.println("\nI'm a Constructor...");
    }
    String Name ;
    int Age ;
    int Rno ;
    double Cgpa ;

    void setData(String name , int age , int rno , double cgpa) {
        Name = name;
        Age = age;
        Rno = rno;
        Cgpa = cgpa;
    }

    void printData(){
        System.out.println("My name Is : "+Name+" and I'm : "+Age+" Years Old,\nMy Roll No Is : "+Rno+" and CGPA Is : "+Cgpa+" |");
    }

}   
    
class Car {
    String Brand ;
    String Model ;
    int Year ;
    long Price ;

    void setData(String brand , String model , int year , long price ) {
       Brand = brand;
       Model = model;
       Year = year;
       Price = price;
    }

    void getData() {
        System.out.println();
        System.out.println("Brand Of Car   : "+Brand);
        System.out.println("Model Of Car   : "+Model);
        System.out.println("Year Of Launch : "+Year);
        System.out.println("Price Of Car   : "+Price);
    }
}