import java.util.*;
public class L_4loops {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // int counter = 0;
        // while (counter < 10) {
        //     System.out.println("Hello World!");            
        //     counter ++;
        // }
        // System.out.println("Loop Ended!");

        // int n = 0;
        // while(n<11) {
        //     System.err.println(n);
        //     n++;
        // }

        // // Print Numbers From 1 to N 
        // System.out.print("Enter Final Target : ");
        // int target = sc.nextInt();
        // int i = 0;
        // while (i <= target) {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("Target Reached!");

        // // Print sum Of N natural Numbers
        // int sum = 0;
        // int j = 0;
        // System.out.print("Enter Final Target : ");
        // int N = sc.nextInt();

        // while (j <= N) {
        //     sum += j;
        //     j++;
        // }
        // System.out.println("Sum Of N Natural Number Is : " + sum);

        // // Print Square Pattern  
        // for (int i = 0 ; i < 5; i++) {
        //     System.err.println();
        //     for(int j = 0 ; j < 5 ; j++) {
        //         System.err.print(" * ");
        //     }
        // }

        // // Print Reverse Of a Number 
        // int num = 10899;
        // int lastDigit;
        // while (num > 0) {
        //     lastDigit = num % 10;
        //     System.out.print(lastDigit);
        //     num /= 10;
        // }

        // Reverse a Number 

        // int number = 10899;

        // int Rem ;
        // int newNumber = 0 ;
        // while (number > 0) {
        //     Rem = number % 10;
        //     newNumber = (newNumber*10) + Rem;
        //     number /= 10;
        // }
        // System.out.println(newNumber);

        // int counter = 1;

        // do {
        //     System.out.println("Hello! Everyone");
        //     counter ++;
        // } while (counter <= 10);

        // int Number = 1;
        // do {
        //     if(Number % 2 == 0){
        //         System.out.println(Number);
        //     }
        //     Number ++;
        // } while(Number <= 20);

        // // Example On break Statement 
        // int n ;
        // do {
        //     System.out.print("Enter You Number : ");
        //     n = sc.nextInt();
        //     if(n % 10 == 0){
        //         System.out.println("You Entered Multiple Of 10");
        //         break;
        //     }
        //     System.err.println("You Entered : " + n + " Which Is not Multiple Of 10 , Try again....");
        // }while(true);

        // // Example On Continue Statement 
        // int N ;
        // do {
        //     System.out.print("Enter You Number : ");
        //     N = sc.nextInt();
        //     if(N % 10 == 0){
        //         System.out.println("You Entered Multiple Of 10");
        //         continue;
        //     }
        //     System.err.println("You Entered : " + N );
        // }while(true);

        // // Check If Number Is Prime Or Not 

        // int Number = sc.nextInt();
        // if( Number == 2){
        //     System.out.println("Number Is Prime");
        // }else{
        //     boolean isPrime = true;
        //     for(int i = 2 ; i <= Math.sqrt(Number)  ; i++){
        //         if(Number % i == 0){
        //         isPrime = false;
        //         }
        //     }

        //     if(isPrime == true){
        //         System.out.println("Number Is Prime");
        //     }else{
        //         System.out.println("Number Is not a Prime");
        //     }
        // }

        // // Read set Of Integer And then Print Even & Odd Number Sum 

        // int evenSum = 0;
        // int oddSum = 0;
        // for(int i = 1 ; i <= 10 ; i++){
        //     System.out.print("Enter Number : ");
        //     int Integer = sc.nextInt();
        //     if(Integer % 2 == 0){
        //         evenSum += Integer;
        //     } else {
        //         oddSum += Integer;
        //     }
        // }

        // System.out.println("Sum Of Even Integers : " + evenSum);
        // System.out.println("Sum Of Odd Integers : " + oddSum);

        // // Find the Factorial Of A number 

        // int fact = 1;
        // System.out.print("Enter Your Number : ");
        // int targ = sc.nextInt();
        // for(int i = targ ; i >= 1 ; i --){
        //     fact *= i;
        // }
        // System.out.println("Fact Of : " + targ + " Is : " + fact);

        System.out.print("Enter Your Number : ");
        int numTable = sc.nextInt();
        int Result = 1;
        for(int i= 1 ; i <= 10 ; i++){
            Result = numTable*i;
            System.out.println(numTable + " * " + i +" = " + Result);
        }
        sc.close();
    }
}
