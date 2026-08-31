import java.util.*;
public class funtions {

    // Calculate Factorial Of a Number
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = n ; i >= 1 ; i--) {
            fact *= i;
        }
        return fact;
    }

    // Swap two Numbers (Pass by Value)
    public static void Swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value Of a : " + a + " , & Value of b : " + b);
    }

    public static void Product(int a , int b) {
        int Product = a * b;
        System.out.println("Product : " + Product);
    }

    public static int binCoeff(int n , int r) {
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int nmrFact = Factorial(n-r);
        return (nFact/(rFact*nmrFact));
    }

    public static void sum(int a , int b) { 
        System.out.println("Funtion 1 Is Called & \nSum : " + (a+b));
    }

    public static void sum(int a , int b , int c) {
        System.out.println("Funtion 2 Is Called & \nSum : " + (a+b+c));
    }

    public static void sum(float a , float b) {
        System.out.println("Funtion 3 Is Called & \nSum : " + (a+b));
    }

    public static boolean checkPrime(int n) {
        boolean isPrime = true;
        if(n == 2) {
            return true;
        } else {
            for(int i = 2; i <= n-1 ; i++) {
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            } 
        }
        if (isPrime == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPrimeOpt(int n) {
        if (n == 2){
            return true;
        }
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i = 2 ; i <= n ; i++) {
            if(checkPrimeOpt(i) == true) {
                System.out.print(i + " , ");
            }
        }
    }

    public static void BDconversion (int num) {
        int originalB = num;
        int pow = 0;
        int decNumber = 0;
        while (num > 0) {
            int Rem = num % 10;
            decNumber += Rem*(int)Math.pow(2, pow);
            pow++;
            num /= 10;            
        }
        System.out.println(originalB + " In Decimal Is Equal to : " + decNumber);
    }

    public static void DBconversion(int decNum) {
        int originalD = decNum;
        int pow = 0;
        int binNumber = 0;
        while(decNum > 0) {
            int Rem = decNum % 2;
            binNumber += Rem*(int)Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        System.out.println(originalD + " In Decimal Is Equal to : " + binNumber);
    }

    public static void calAverage(int a , int b , int c) {
        float Average = (float)((a + b + c)/3);
        System.out.println("Average of Three Numbers Is : " + Average);
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void sumDigits(int number) {
        int Orig_num = number;
        int Rem = 0;
        int sum = 0;
        while(number > 0) {
            Rem = number % 10;
            sum += Rem;
            number /= 10;
        }
        System.out.println("Sum Of digits In : " + Orig_num + " : Is : " + sum);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // // Funtion 1
        // System.out.print("Enter Number : ");
        // int number = sc.nextInt();
        // int factorial = Factorial(number);
        // System.out.println("Factorial Of : " + number + " Is : " + factorial);

        // // Funtion 2
        // System.out.print("Enter Number a : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Number b : ");
        // int num2 = sc.nextInt();
        // Swap(num1, num2);
        // System.out.println("Value Of a : " + num1 + " , & Value of b : " + num2 + " After Call by Value.");

        // // Funtion 3
        // System.out.print("Enter Number 1 : ");
        // int Number1 = sc.nextInt();
        // System.out.print("Enter Number 2 : ");
        // int Number2 = sc.nextInt();
        // Product(Number1, Number2);

        // // Funtion 4
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // System.out.print("Enter r : ");
        // int r = sc.nextInt();
        // int binCoefficient = binCoeff(n, r);
        // System.out.println("Binomial Co-efficient : " + binCoefficient);

        // // Funtion 5 (Funtion Overloading)
        // sum(4, 5);
        // sum(2,3,4);
        // sum((float) 3.5 , (float) 4.5);

        // // Funtion 6 
        // System.out.print("Enter Number : ");
        // int Number = sc.nextInt();

        // if(checkPrime(Number) == true) {
        //     System.out.println(Number + " : Is Prime");
        // } else {
        //     System.out.println(Number + " : Is Composite.");
        // }
        // // Funtion 7
        // System.out.print("Enter Number1 : ");
        // int Number1 = sc.nextInt();

        // if(checkPrimeOpt(Number1) == true) {
        //     System.out.println(Number1 + " : Is Prime");
        // } else {
        //     System.out.println(Number1 + " : Is Composite.");
        // }

        // // Funtion 8
        // System.out.print("Enter Number For Range : ");
        // int Rno = sc.nextInt();
        // primeInRange(Rno);

        // // Funtion 9
        // System.out.print("Enter Binary Number : ");
        // int binNum = sc.nextInt();
        // BDconversion(binNum);

        // // Funtion 10
        // System.out.print("Enter Decimal Number : ");
        // int decNum = sc.nextInt();
        // DBconversion(decNum);

        // PRACTICE QUESTIONS ON FUNTIONS

        // // Question 1 
        // System.out.print("Enter number 1 : ");
        // int x = sc.nextInt();
        // System.out.print("Enter number 2 : ");
        // int y  = sc.nextInt();
        // System.out.print("Enter number 3 : ");
        // int z = sc.nextInt();
        // calAverage(x,y,z);

        // // Question 2
        // System.out.print("Enter Number : ");
        // int numb = sc.nextInt();
        // if(isEven(numb) == true){
        //     System.out.println(numb + " Is Enen.");
        // } else {
        //     System.out.println(numb + " Is Odd.");
        // }

        // // Question 3
        // System.out.print("Enter Number : ");
        // int Snumber = sc.nextInt();
        // sumDigits(Snumber);

        // Question 4
        
        System.out.print("Enter number 1 : ");
        int numb1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int numb2 = sc.nextInt();
        System.out.println((int)Math.min(numb1, numb2));
        System.out.println((int)Math.max(numb1, numb2));
        System.out.println((int)Math.pow(numb1, numb2));
        System.out.println((int)Math.abs(numb1));
        System.out.println((int)Math.sqrt(16));




















    }
    
}
