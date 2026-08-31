import java.util.*;
public class L_2ConditionalStatment  {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // Check Adult 
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult : Can Vote , Drive etc");
        }else{
            System.out.println("Not An Adult");
        }

        // // Find Greater Number 
        // int number1 = sc.nextInt();
        // int number2 = sc.nextInt();

        // if(number1 > number2){
        //     System.out.println("Number 1 is Greater");
        // }if(number1 < number2){
        //     System.out.println("Number 2 is Greater");
        // }else{
        //     System.out.println("Both Are Equal");
        // }

        // // Check Even and Odd Of number 
        // System.out.print("Enter A number : ");
        // int number = sc.nextInt();
        // if(number % 2 == 0){
        //     System.out.println(number + " is Even.");
        // }else{
        //     System.out.println("Number is Odd.");
        // }

        // // Income Tax Calculator 

        // System.out.print("Enter Your Income : ");
        // int Income = sc.nextInt();
        // float Tax ;
        // if(Income < 500000){
        //     Tax = 0*Income;
        //     System.out.println("Tax On : " + Income + " Is : " + Tax);
        // }else if(Income >= 500000){
        //     Tax = (float) 0.2*Income;
        //     System.out.println("Tax On : " + Income + " Is : " + Tax);
        // }else{
        //     Tax = (float) 0.3*Income;
        //     System.out.println("Tax On : " + Income + " Is : " + Tax);
        // }

        // // Largest Of Three Numbers

        // System.out.println("Enter First Number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number : ");
        // int b = sc.nextInt();
        // System.out.println("Enter Third Number : ");
        // int c = sc.nextInt();
        // int Greater ;

        // if(a >= b && a >= c){
        //     Greater = a;
        // }else if(b >= a && b >= c){
        //     Greater = b;
        // }else{
        //     Greater = c;
        // }

        // System.out.println("Greatest Between Three number is : " + Greater);

        // // Ternarry Operator
        // int Marks = 40;
        // String Result = (Marks > 33) ? "PASS" : "FAIL";
        // System.out.println("Student Is : " + Result);

        // int age = 21;
        // String Voting = (age >= 18) ? "Can Vote" : "Can't Vote";
        // System.out.println("He  : " + Voting);

        // Switch Statement In Java 

        // System.out.print("Press Any Button to Invite Your Favorite Dish : ");
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1 : System.out.println("Pizza");
        //              break;
        //     case 2 : System.out.println("Burger");
        //              break;
        //     case 3 : System.out.println("Juice");
        //              break;
        //     default : System.out.println("This Dish is not Included");
        // }

        // // To Make A Simple Calculator
        // System.out.print("Enter Number 1 : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Number 2 : ");
        // int num2 = sc.nextInt();

        // System.out.println("Enter Number Operator : ");
        // char op = sc.next().charAt(0);

        // switch (op) {
        //     case '+' : System.out.println("Sum Of " + num1 + " & " + num2 + " give Us : " + (num1 + num2));
        //                break;
        //     case '-' : System.out.println("Subtraction Of " + num1 + " & " + num2 + " give Us : " + (num1 - num2));
        //                break;
        //     case '*' : System.out.println("Multiplication Of " + num1 + " & " + num2 + " give Us : " + (num1 *num2));
        //                break;
        //     case '/' : System.out.println("Division Of " + num1 + " & " + num2 + " give Us : " + (num1 / num2));
        //                break;
        //     default:   System.out.println("Please! Enter Aritmetic Operator.");
        //                break;
        // }

        // // PRACTICE QUESTIONS ON CONDITIONAL STATEMENT 

        // System.out.print("Enter A Number : ");
        // int numb = sc.nextInt();
        // if(numb > 0){
        //     System.out.println(numb + " : Is Possitve");
        // }else if(numb < 0){
        //     System.out.println(numb + " : Is Negative");
        // }else{
        //     System.out.println("You Entered Zero...");
        // }

        // // Check Fever 
        // double temp = 103.4;
        // if(temp >= 100){
        //     System.out.println("You have Fever...");
        // }else{
        //     System.out.println("You don't Have Fever...");
        // }

        // // Guessing week Days 
        // System.err.print("Enter number (1 -> 7) : ");
        // int W_number = sc.nextInt();
        // switch (W_number){
        //     case 1 : System.out.println("It's Monday.");
        //              break;
        //     case 2 : System.out.println("It's Tuesday.");
        //              break;
        //     case 3 : System.out.println("It's Wednesday.");
        //              break;
        //     case 4 : System.out.println("It's Thursday.");
        //              break;
        //     case 5 : System.out.println("It's Friday.");
        //              break;
        //     case 6 : System.out.println("It's Saturday.");
        //              break;
        //     case 7 : System.out.println("It's Sunday.");
        //              break;
        //     default : System.out.println("You Entered Number Out Of Range...");
        // }

        // // Guessing Values 
        // int a = 63,b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println("Value Of X is : " + x);
        // System.out.println("Value Of Y is : " + y);

        // // Check If Year is Leap 
        // System.out.print("Enter Year : ");
        // int Year = sc.nextInt();
        // if(((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0)){
        //     System.out.println("It's Leap Year");
        // }else{
        //     System.out.println("It's Not a Leap Year...");
        // }

        // sc.close();
        

    }
    
}
