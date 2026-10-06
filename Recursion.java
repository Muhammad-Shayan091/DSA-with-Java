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

    public static int Tilling(int n) {
        if(n==1 || n==0){
            return 1;
        }

        return Tilling(n-1)+Tilling(n-2);
    }

    public static void removeDuplicate(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friedsPair(int n){
        if(n==0 || n==1){
            return n;
        }

        return friedsPair(n-1)+ (n-1)*friedsPair(n-2);
    }
    public static void PrintBinStr(int  size , int last_Place , String str){
        if(size==0){
            System.out.println(str);
            return;
        }

        PrintBinStr(size-1, 0 , str+"0");
        if(last_Place == 0){
            PrintBinStr(size-1, 1, str+"1");
        }
    }

    public static void linear_Search(int Arr[] , int key , int index){
        if(index == Arr.length){
            return ;
        }

        if(Arr[index] == key){
            System.out.print(index +" ");
        }
        linear_Search(Arr, key, index+1);
    }

    static String[] nums = { "Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Sex" , "Seven" , "Eight" , "Nine" };

    public static void numTostr(int n , StringBuilder str){
        if(n==0){
            return ;
        }

        int Digit = n%10;
        numTostr(n/10, str);
        str.append(nums[Digit]).append(" ");
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // // Print numbers in Dec Order 
        // System.out.println("Decreasing Order : ");
        // printInc(10);
        // // Print number in Inc Order
        // System.out.println("\nIncreasing Order : ");
        // printDec(10);
        // // Print number from n to n 
        // System.out.println("\nIncreasing Order : ");
        // printIncrease(51);
        // // print Factorial of number 
        // System.out.println("\nFactorial : "+Factorial(6)+" ");
        // // Print Sum Of n numbers 
        // System.out.println("Sum : "+Sum(100));
        // // Check if an Array Is Sorted or not
        // int Arr[] = {1,2,3,3,4,5};
        // if(Is_Sorted(Arr,0)) {
        //     System.out.println("Array Is Sorted..!");
        // } else {
        //      System.out.println("Array Is not Sorted..!");
        // }
        // // Print nth fibonacci number 
        // System.out.print("Enter numbe for fibo(n) : ");
        // int n = sc.nextInt();
        // System.out.println("fibonacci("+n+") Is : "+fibonacci(n));
        // // Print the First Occurence index Of an element in Array
        // System.out.println("Element Found at Index : " + first_Occurence(Arr, 3, 0));
        // // Print Last Occurence 
        // System.out.println("Element Found at Index : " + last_Occurence(Arr, 3, Arr.length-1));
        // // Power Calculation
        // System.out.print("Enter Base : ");
        // int base = sc.nextInt();
        // System.out.print("Enter Power : ");
        // int pow = sc.nextInt();
        // System.out.println(base+"^"+pow+" = "+Power(base, pow));
        // // By Optimal Way 
        // System.out.println(base+"^"+pow+" = "+Opt_Power(base, pow));
        // // Tilling Problem 
        // System.out.print("Enter Your Width : ");
        // int Width = sc.nextInt();
        // System.out.println("Total No Of Ways To Tile : " + Tilling(Width));
        // // Remove Duplicate
        // System.out.print("Enter Your String : ");
        // String str = sc.next();
        // removeDuplicate(str, 0, new StringBuilder("") , new boolean[26]);
        // Friends Pairing 
        // System.out.println("Total Pairs Can Formed : " + friedsPair(3));
        // PrintBinStr(4, 0, "");
        // // Linear Search 
        // int Arr[] = {1,2,3,2,4,2,5,2};
        // int Key = 2;
        // System.out.print("Indexes of Target : ");
        // linear_Search(Arr, Key, 0);
        // Digit-to-Strings Problem 
        int n = 2026;
        if(n==0){
            System.out.println("Zero ");
        }else{
            StringBuilder result = new StringBuilder();
            numTostr(n, result);
            System.out.println(result.toString().trim());
        }
    }
}