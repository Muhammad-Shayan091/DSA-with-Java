import java.util.*;
public class L_3Operators {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = 20;
        int b = 4;
        
        // Arithemetic Operators 
        System.out.println("Sum : " + (a+b));
        System.out.println("Sub : " + (a-b));
        System.out.println("Product : " + (a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Reminder : " + (a%b));

        // Unary Operators 
        int x = 5;
        int y = x++;
        System.out.println("Post Increment y : " + y);    // x = 6 , y = 5
        System.out.println("And X also : " + x);
        y = ++x;
        System.out.println("Pre Increment y : " + y);     // x = 7 , y = 7
        System.out.println("And X also : " + x);
        // same for --x , x-- , **x , x** ....etc

        // Relational Operators
        int l = 10;
        int m = 5;
        System.out.println("l = 10");
        System.out.println("m = 5");
        System.out.println("l > m : "  + (l>m));
        System.out.println("l >= m : " + (l>=m));
        System.out.println("l < m : "  + (l<m));
        System.out.println("l <= m : " + (l<=m));
        System.out.println("l == m : " + (l==m));
        System.out.println("l != m : " + (l!=m));

        // Logical Operators
        // AND (&&) Operator 
        System.out.println("(10 > 5) && (5 > 4) : " + ((10 > 5) && (5 > 4)));     
        System.out.println("(10 < 5) && (5 > 4) : " + ((10 < 5) && (5 > 4)));
        System.out.println("(10 > 5) && (5 < 4) : " + ((10 > 5) && (5 < 4)));
        System.out.println("(10 < 5) && (5 < 4) : " + ((10 < 5) && (5 < 4)));

        // OR (||) Operator 
        System.out.println("(10 > 5) || (5 > 4) : " + ((10 > 5) || (5 > 4)));     
        System.out.println("(10 < 5) || (5 > 4) : " + ((10 < 5) || (5 > 4)));
        System.out.println("(10 > 5) || (5 < 4) : " + ((10 > 5) || (5 < 4)));
        System.out.println("(10 < 5) || (5 < 4) : " + ((10 < 5) || (5 < 4)));
        
        // NOT (!) Operator 
        System.out.println("(10 > 5) && (5 > 4) : " + !((10 > 5) && (5 > 4)));     
        System.out.println("(10 < 5) && (5 > 4) : " + !((10 < 5) && (5 > 4)));
        System.out.println("(10 > 5) && (5 < 4) : " + !((10 > 5) && (5 < 4)));
        System.out.println("(10 < 5) && (5 < 4) : " + !((10 < 5) && (5 < 4)));

        // Assignment Operator
        int p = 20;
        int q = 10;

        p += q;
        System.out.println("20 + 10 : " + p);
        p-=q;
        System.out.println("30 - 10 : " + p);
        p*=q;
        System.out.println("20 * 10 : " + p);
        p/=q;
        System.out.println("20 / 10 : " + p);

        float j = 4;
        float k = 2;

        float Result1 = (j*k/j);
        System.err.println("j * k / j : " + Result1);
        float Result2 = (j*(k/j));
        System.out.println("j * (K / j) : " + Result2);

        int X , Y , Z ;
        X = Y = Z = 4;
        X += Y;
        Y -= Z;
        Z /= (X+Y);
        System.out.println(X + " " + Y + " " + Z);

        int R = 9, S = 12;int T = 2, U = 4, V = 6;
        int exp = 4/3 * (R + 34) + 9 * (T + U * V) + (3 + S * (2 + T)) / (T + U*S);
        System.out.println(exp);

        sc.close();



           
    }
}
