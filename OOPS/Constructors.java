public class Constructors {

    public static void main(String args[]) {

        Student S1 = new Student("Shayan" , 6259 , "khan1234");
        S1.Marks[0] = 90;
        S1.Marks[1] = 91;
        S1.Marks[2] = 92;
        S1.getData();

        // Second Student 
        Student S2 = new Student(S1);
        S2.name = "Muhammad Shayan";
        S2.getData();
        System.out.println("Before Updation : ");
        for(int i = 0 ; i < 3 ; i++) {
            System.out.println(S2.Marks[i]); 
        }
        S1.Marks[0] = 100;
        System.out.println("After Updation : ");
        for(int i = 0 ; i < 3 ; i++) {
            System.out.println(S2.Marks[i]); 
        }
        
    }
    
}

class Student {
    String name ;
    int Rno ;
    String password;
    int Marks[];

    // Non_Parameterized Constructor 
    Student() {
        Marks  = new int[3];
        System.out.println("I'm a Non-Parameterized Constructor...");
    }

    // Prameterized Constructor 
    Student(String name , int Rno , String password) {
        Marks  = new int[3];
        this.name = name;
        this.Rno = Rno;
        this.password = password;
    }

    // // Shallow Copy                |---> Changes Reflect
    // Student(Student S1) {
    //     Marks  = new int[3];
    //     this.name = S1.name;
    //     this.Rno = S1.Rno;
    //     this.password = S1.password;
    //     this.Marks = S1.Marks;
    // }

    
    // Deep Copy                       |---> No Changes Reflect
    Student(Student S1) {
        Marks  = new int[3];
        this.name = S1.name;
        this.Rno = S1.Rno;
        this.password = S1.password;
        for(int i = 0 ; i < 3 ; i++) {
            this.Marks[i] = S1.Marks[i];
        }
    }

    void getData(){
        System.out.println("My name Is : "+name);
        System.out.println("Roll No : "+Rno);
        System.out.println("Password : "+password);
    }

}
