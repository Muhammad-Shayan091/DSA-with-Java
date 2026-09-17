import java.util.*;
public class bit_Manipulation {                             // (Indexing Start From 0,1,.......n)

    // Count number of 1 Bits
    public static int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    // // Check Even and Odd 
    public static void checkEvenOdd(int num1){
        int bitMask = 1;
        if((num1 & bitMask) == 0) {
            System.out.println(num1 + " : Is Even.");
        } else {
            System.out.println(num1 + " : Is Odd.");
        }
    }

    // Check ith Bit
    public static void checkBit(int num , int i) {
        int bitmask = 1<<i;
        if((num&bitmask) == 0) {
            System.out.println("Number Is 0 at ith bit...");
        } else {
            System.out.println("Number Is 1 at ith bit...");
        }

    }

    // Set bit to 1
    public static int setbit(int num , int i) {
        int bitmask = 1<<i;
        return num|bitmask;
    }
    
    // Set Bit to 0
    public static int clearBit(int num , int i) {
        int bitMask = ~(1<<i);
        return num&bitMask;
    }

    // Update iTh Bit 
    public static int updateBit(int num , int i , int newBit) {
        if(newBit == 0) {
            return clearBit(num, i);
        } else {
            return setbit(num, i);
        }
    }

    // Method
    public static int Updatebit(int num , int i , int newBit) {
        num = clearBit(num, i);
        int bitmask = newBit<<i;
        return num | bitmask;
    }

    // CLear up to ith Bit 
    public static void clearIthBit(int num , int i) {
        int bitmask = (~0)<<i;
        System.out.println(bitmask&num);
    }

    // Clear Range Of Bits 
    public static void clearRangeofBit(int num , int i,int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        System.out.println(num&bitmask);
    }

    // Check number IS Power Of 2 
    public static boolean isPowerOf2(int num) {
        return ((num&(num-1)) == 0);
    }

    // Count Set Bit 
    public static int countSetbit(int num) {
        int count = 0;
        while (num != 0) {
            if((num & 1) != 0) {
                count++;
            }
            num = num >> 1;    
        }
        return count;
    }

    // Calculate a pow n
    public static double FastPow(double x , int n) {
        double Res = 1;
        long N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }

        while(N > 0){
            if((N & 1) == 1){
                Res *=x;
            }
            x *= x;
            N = N>>1;
        }

        return Res;
    }

    // Self-XoR 
    public static int selfXoR(int x){
        return x^x;
    }

    // Swap without Using 3rd Variable 
    public static void Swap(int a , int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping  : a = "+a+" & b = "+b);
    }

    // Add 1 to an Integer 
    public static void sumOne(int num) {
        System.out.println(num + " + 1 = " + -(~num));
    }

    // Upper-Lower 
    public static void caseConvertToLower(char ch) {
        System.err.println(ch + " : In Lower Case Is : " + (char)(ch|32));
    }

    // Lower-Upper 
    public static void caseConvertToUpper(char ch) {
        System.err.println(ch + " : In Lower Case Is : " + (char)(ch&(~32)));
    }

    public static int modularExponentiation(int a , int n , int m) {
        int Res = 1;
        a = a % m;
        while (n > 0) {
            if((n&1) != 0) {
                Res *= a % m;
            }

            a *= a % m;
            n = n>>1;
        }
        return Res;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        int num2 = 3;
        
        // // Simple biwise Operators
        // System.out.println("Num1 & Num2 : " + (num1 & num2));
        // System.out.println("Num1 | Num2 : " + (num1 | num2));
        // System.out.println("Num1 ^ Num2 : " + (num1 ^ num2));
        // System.out.println("Num1 << Num2 : " + (num1<<2));
        // System.out.println("Num1 >> Num2 : " + (num1>>2));

        // // // Check ith Bit 
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();
        // System.out.print("Enter Position : i : ");
        // int position = sc.nextInt();
        // System.out.print("Enter Position : J : ");
        // int positionj = sc.nextInt();

        // // Check Bit (0 or 1)
        // checkBit(num,position);
        // // Set bit (1 by | if 0)
        // System.out.println(setbit(num, position));
        // // clear ith Bit ]
        // System.out.println(clearBit(num, position));
        // // Update bit
        // System.out.println(updateBit(num, position , 0));
        // System.out.println(Updatebit(num, position , 0));
        // // ClearRange
        // clearRangeofBit(num, position , positionj);
        // // Check Power of 2
        // if(isPowerOf2(num)) {
        //     System.out.println("Num Is Power Of 2");
        // } else {
        //     System.out.println("Num Is not Power 2");
        // }

        // // Print No Of Bits 
        // System.out.println("Set Bits Are : " + countSetbit(num));

        // // Calculate the X Pow n
        // System.out.println("Enter n : ");
        // int pow = sc.nextInt();
        // System.out.println("Result Of : "+num+" Power : "+ pow + " Is : "+FastPow(num , pow));

        // // Calculate selfXOR (Always 0)
        // System.out.println(num + " XoR " +num+ " = " +selfXoR(num));

        // // Swap two number without Using third variable 
        // System.out.print("Enter number 1 : ");
        // int a = sc.nextInt();
        // System.out.print("Enter number 2 : ");
        // int b = sc.nextInt();
        // System.out.println("before swapping : a = "+a+" & b = "+b);
        // Swap(a, b);

        // // Add 1 To an Integer (By Two'S Compliment : -n = ~n + 1 and also n + 1 = -(~n))
        // sumOne(num);

        // // Case Conversion 
        // System.out.print("Enter Upper Case Char : ");
        // char ch = sc.next().charAt(0);
        // caseConvertToLower(ch);
        // System.out.print("Enter Lower Case Char : ");
        // char ch1 = sc.next().charAt(0);
        // caseConvertToUpper(ch1);

        // // Modular Eponentiaton 
        // System.out.print("Enter number : ");
        // int number = sc.nextInt();
        // System.out.print("Enter Power : ");
        // int Power = sc.nextInt();
        // System.out.print("Enter Modulo : ");
        // int Modulo = sc.nextInt();
        // System.out.print("Reminder : " + modularExponentiation(number, Power, Modulo));
        











    }
    
}
