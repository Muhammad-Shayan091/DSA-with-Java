import java.util.*;
public class L_1javaBasics {
        public static  void main(String arg[]) {
        // OUTPUT IN JAVA 
        System.out.println("\nHi  Everyone , You are Watching Sigmax from Apna college");
        System.out.println("\nMy name is Muhammad Shayan");
        System.out.println("\nI'm 21 Years Old");
        System.out.println("\nMy Favorite Color is Red");
        System.out.println("\nHello , World");
        System.out.println("\nI Lived In Charsadda &\nI'm From Pakistan");
        System.out.println("\n1 , 2 , 3 , 4 , 5");
        System.out.println("\n10\n20\n30\n40\n50");
        System.out.println("\nJava\nIs\nFun");
        System.out.println("\n*****\n*****\n*****\n*****\n*****\n*****\n");
        System.out.println("\n*\n**\n***\n****\n*****\n******");
        System.out.println("\n******\n*****\n****\n***\n**\n*");
        System.out.println("\n     *\n    **\n   ***\n  ****\n *****\n******");

        // VARIABLES AND DATA-TYPES IN JAVA

        int age = 21;
        System.out.println("Age before : ");
        System.out.println(age);
        age = 24;
        System.out.println("Age After : ");
        System.out.println(age);
        // It means variables values changes

        double price = 99.99;
        System.out.println(price);

        char grade = 'A';
        System.out.println(grade);

        boolean passed = true;
        System.out.println(passed);

        int x = 10;
        x = 20;
        System.out.println(x);

        int a1 = 10;
        int y = a1;
        a1 = 20;
        System.out.println(y);

        
        // swapping
        int b2 = 20;
        int c2 = 30;

        int temp = b2;
        b2 = c2;
        c2 = temp;

        System.out.println(b2);
        System.out.println(c2);

        // sum of two numbers
        int num1 = 20;
        int num2 = 35;
        int sum = num1 + num2;
        System.out.println(sum);

        // INPUTS IN JAVA 
        Scanner sc = new Scanner(System.in);

        int B1 = sc.nextInt();
        int A1 = sc.nextInt();
        int Sum = A1 + B1;
        System.out.println(sum);

        String name = sc.nextLine();
        int Age = sc.nextInt();
        Float CGPA = sc.nextFloat();
        String Mob_Password = sc.next();
        Float height = sc.nextFloat();
        String Grade = sc.next();
        Boolean isStudent = sc.nextBoolean();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + CGPA);
        System.out.println("Mob_Password : " + Mob_Password);
        System.out.println("Height : " + height);
        System.out.println("Grade : " + Grade);
        System.out.println("It's " + isStudent + " that " + name + " Is Student.");


        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float Area = (length*width);
        System.out.println(Area);

        Float Price = sc.nextFloat();
        Integer Quantity = sc.nextInt();
        System.out.println(Price*Quantity);

        // Swapping
        Integer no1 = sc.nextInt();
        Integer no2 = sc.nextInt();

        int Temp = no1;
        no1 = no2;
        no2 = Temp;

        System.out.println(no1);
        System.out.println(no2);
        
        // Product of Two Numbers 
        Integer Num1 = sc.nextInt();
        Integer Num2 = sc.nextInt();

        Integer Product = Num1 * Num2;
        System.out.println("Product : " + Product);

        // Area Of Circle 
        float Radius = sc.nextFloat();
        float Pie = 3.14f;
        float Area_of_Circle = (Pie*Radius*Radius);
        System.out.println("Area_of_Circle : " + Area_of_Circle);

        // TYPE CONVERSION IN JAVA 
        int A = sc.nextInt();
        float B = A;
        System.out.println(B);
        float C = 3.0f;
        double D = C;
        System.out.println(D);
        double E = 3;
        int F = (int) E;
        System.out.println(E);
        System.out.println(F);
        int G = 10;
        double H = G;
        System.out.println(H);
        double Price1 = 99.99;
        int newPrice = (int) Price1;
        System.out.println(newPrice);
        double marks = 87.7;
        int newMarks = (int) marks;
        System.out.println("Original : " + marks);
        System.out.println("New Marks : " + newMarks);

        // TYPE PROMOTION IN JAVA 
        char a = 'a';
        char b = 'b';
        System.out.println(b-a);      // R = 1
        System.out.println((int)(a)); // R = 97
        System.out.println((int)(b)); // R = 98
        // char C = b-a It's Impossible because , b-a is treated as integer.
        byte bi = 3;
        bi = (byte) (bi*2);              // Only bi*2 give error because it's treated as integer and losssy conversion occurs
        System.out.println(bi);     

        // PRACTICE QUESTIONS ON VAR_&_DT 

        // Average Of numbers
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        float Average = (numb1 + numb2 + numb3)/3;
        System.out.println("Average : " + Average);

        // Area of Square 
        System.out.println("Enter length : ");
        float length1 = sc.nextFloat();
        System.out.println("Enter Width : ");
        float width2  = sc.nextFloat();

        float Area_Of_Square = length1*width2;
        System.out.println("Area Of Square : " + Area_Of_Square);

        // Total Cost & Tax On items
        System.out.println("Enter Pen Price : ");
        int Pen = sc.nextInt();
        System.out.println("Enter Pencil Price : ");
        int Pencil = sc.nextInt();
        System.out.println("Enter Eraser Price : ");
        int Eraser = sc.nextInt();

        int totalCost = Pen + Pencil + Eraser;
        System.out.println("Total Cost Of Items : " + totalCost);
        float costWithTaxes = totalCost + totalCost*18/100;
        System.out.println("Cost After Taxes : " + costWithTaxes);
        
        // Type PROMOTION Question 
        byte X = 4;
        char Y = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double Result = (f*X) + (i%Y) - (d*s);
        System.out.println("Result : " + Result);
        
        // Error Check
        int $ = 24;
        System.out.println($);

        sc.close();

    }
}