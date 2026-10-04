import java.util.*;
public class Recursion{
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return ;
        }

        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void printDec(int n){
        if(n==1){
            System.out.print(n + " ");
            return ;
        }

        System.out.print(n + " ");
        printInc(n-1);
    }

    public static void printIncrease(int n){
        if(n==100){
            System.out.print(n+" ");
            return ;
        }
        System.out.print(n+" ");
        printIncrease(n+1);
    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }

    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }

    public static boolean Is_Sorted(int Arr[] , int i){
        if(i == Arr.length-1){
            return true;
        }
        if(Arr[i] > Arr[i+1]){
            return false;
        }

        return Is_Sorted(Arr, i+1);
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static int last_Occurence(int Arr[] , int key , int i){
        if(i < 0){
            return -1;
        }

        if(Arr[i] == key){
            return i;
        }

        return last_Occurence(Arr, key, i-1);
    }

    public static int first_Occurence(int Arr[] , int key , int i){
        if(i>=Arr.length){
            return -1;
        }

        if(Arr[i] == key){
            return i;
        }

        return first_Occurence(Arr, key, i+1);
    }

    public static long Power(int X , int n) {
        if(n==0){
            return 1;
        }
        
        return X*Power(X, n-1);
    }

    public static int Opt_Power(int x , int n){
        if(n==0){
            return 1;
        }
        int half_Pow = Opt_Power(x, n/2);
        int full_Pow = half_Pow*half_Pow;
        if(n%2!=0){
            full_Pow = x*full_Pow;
        }
        return full_Pow;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // Print numbers in Dec Order 
        System.out.println("Decreasing Order : ");
        printInc(10);
        // Print number in Inc Order
        System.out.println("\nIncreasing Order : ");
        printDec(10);
        // Print number from n to n 
        System.out.println("\nIncreasing Order : ");
        printIncrease(51);
        // print Factorial of number 
        System.out.println("\nFactorial : "+Factorial(6)+" ");
        // Print Sum Of n numbers 
        System.out.println("Sum : "+Sum(100));
        // Check if an Array Is Sorted or not
        int Arr[] = {1,2,3,3,4,5};
        if(Is_Sorted(Arr,0)) {
            System.out.println("Array Is Sorted..!");
        } else {
             System.out.println("Array Is not Sorted..!");
        }
        // Print nth fibonacci number 
        System.out.print("Enter numbe for fibo(n) : ");
        int n = sc.nextInt();
        System.out.println("fibonacci("+n+") Is : "+fibonacci(n));
        // Print the First Occurence index Of an element in Array
        System.out.println("Element Found at Index : " + first_Occurence(Arr, 3, 0));
        System.out.println("Element Found at Index : " + last_Occurence(Arr, 3, Arr.length-1));
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Power : ");
        int pow = sc.nextInt();
        System.out.println(base+"^"+pow+" = "+Power(base, pow));
        System.out.println(base+"^"+pow+" = "+Opt_Power(base, pow));

    }
}