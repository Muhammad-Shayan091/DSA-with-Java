import java.util.*;
public class bit_Manipulation {                             // (Indexing Start From 0,1,.......n)
    public static void checkBit(int num , int i) {
        int bitmask = 1<<i;
        if((num&bitmask) == 0) {
            System.out.println("Number Is 0 at ith bit...");
        } else {
            System.out.println("Number Is 1 at ith bit...");
        }

    }

    public static int setbit(int num , int i) {
        int bitmask = 1<<i;
        return num|bitmask;
    }

    public static int clearBit(int num , int i) {
        int bitMask = ~(1<<i);
        return num&bitMask;
    }

    public static int updateBit(int num , int i , int newBit) {
        if(newBit == 0) {
            return clearBit(num, i);
        } else {
            return setbit(num, i);
        }
    }

    public static int Updatebit(int num , int i , int newBit) {
        num = clearBit(num, i);
        int bitmask = newBit<<i;
        return num | bitmask;
    }

    public static void clearIthBit(int num , int i) {
        int bitmask = (~0)<<i;
        System.out.println(bitmask&num);
    }

    public static void clearRangeofBit(int num , int i,int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        System.out.println(num&bitmask);
    }

    public static boolean isPowerOf2(int num) {
        return ((num&(num-1)) == 0);
    }

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

    public static int FastPow(int a , int n) {
        int Res = 1;
        while (n > 0) {
            if(n % 2 != 0) {
                Res *= a;
            }

            a *= a;
            n = n/2;
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

        // // Check Even and Odd 
        // int bitMask = 1;
        // if((num1 & bitMask) == 0) {
        //     System.out.println(num1 + " : Is Even.");
        // } else {
        //     System.out.println(num1 + " : Is Odd.");
        // }

        // Check ith Bit 
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter Position : i : ");
        int position = sc.nextInt();
        System.out.print("Enter Position : J : ");
        int positionj = sc.nextInt();

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
        int pow = sc.nextInt();
        System.out.println("Result Of : "+num+" Power : "+ pow + " Is : "+FastPow(num , pow));





    }
    
}
