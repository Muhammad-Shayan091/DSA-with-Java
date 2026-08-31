import java.util.*;
import java.util.regex.Pattern;
public class L_5Pattern {
    
    public static void Hollow_Rectangle (int Rows , int cols) {

        for(int i = 1 ; i <= Rows ; i++) {
            for (int j = 1 ; j <= cols ; j++) {
                if((i == 1) || (i == Rows) || (j == 1) || (j == cols)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void InvRotatedPyramid(int lines) {
        for(int i = 1 ; i <= lines ; i++) {
            for(int j = 1 ; j <= lines - i ; j++) {
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invHalfPyramid(int lines) {
        for(int i = lines ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int lines) {
        int counter = 1;
        for(int i = 1 ; i <= lines ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print( counter +" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void binTriangle(int lines) {
        for(int i = 1 ; i <= lines ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void binTriangle2(int lines) {
        int Number = 1;
        for(int i = 1 ; i <= lines ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                if(Number == 1) {
                    System.out.print("1 ");
                    Number = 0;
                } else {
                    System.out.print("0 ");
                    Number = 1;
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n) {

        // Up-Side 
        for(int i = 1 ; i <= n ; i++) {
            // Stars
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1 ; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            // Stars 
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Up-Side 
        for(int i = n ; i >= 1 ; i--) {
            // Stars
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1 ; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            // Stars 
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void Rhombus(int n) {
        for(int i = 1 ; i <= n ; i++) {
            // Print Spaces
            for(int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }

            // print Stars
            for(int j = 1 ; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n) {
        for(int i = 1 ; i <= n ; i++) {
             // Print Spaces
             for(int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
             }
             for (int j = 1 ; j <= n ; j++) {
                 if((i == 1) || (i == n) || (j == 1) || (j == n)) {
                    System.out.print("* ");
                 } else {
                    System.out.print("  ");
                 }
             }
             System.out.println();
        }

    }

    public static void Diamond(int n) {

        // Up-side 
        for(int i = 1 ; i <= n ; i++) {
            // Print Spaces
             for(int j = 1 ; j <= n-i ; j++) {
                System.out.print("   ");
             }

             // Print Stars
             for(int j = 1 ; j <= (2*i - 1); j++) {
                System.out.print(" * ");
             }

             // Print Spaces
             for(int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
             }
             System.out.println();
        }

        // Down-side 
        for(int i = n ; i >= 1 ; i--) {
            // Print Spaces
             for(int j = 1 ; j <= n-i ; j++) {
                System.out.print("   ");
             }

             // Print Stars
             for(int j = 1 ; j <= (2*i - 1); j++) {
                System.out.print(" * ");
             }

             // Print Spaces
             for(int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
             }
             System.out.println();
            
        }

    }

    public static void NumberPattern(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = n ; j >= n-i+1 ; j--) {
                System.out.print(j+" ");
            }

            for(int k = n-i+2 ; k <= n ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void numPattern(int n) {
        for(int i = 1 ; i <= n ; i++) {
            // Increasing Pattern
            for(int j = i ; j >= 1 ; j--) {
                System.out.print(j +" ");
            }
            // decreasing Pattern
            for(int k = 2 ; k <= i ; k++) {
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // // To Print The Half-Square pattern 
        // for(int i = 1 ; i <= 5 ; i++){
        //     System.out.println();
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(" * ");
        //     }
        // }

        // // To Print Inverted Half-Square 
        // for(int i = 5 ; i >= 1 ; i--) {
        //     for(int j = 1 ; j <= i ; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // // To Print Number In Increasing Order 
        // for(int i = 1 ; i <= 5 ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // // To Print The Characters In Pattern 
        // char Ch = 'A';
        // for(int i = 1 ; i <= 5 ; i++) {
        //     for (int j = 1 ; j <= i ; j++) {
        //         System.out.print(Ch + " ");
        //         Ch++;
        //     }
        //     System.out.println();
        // }

        // // Print Same Number In One-One Line 
        // for(int i = 1 ; i <= 5 ; i ++) {
        //     for(int j = 1 ; j <= i ; j ++) {
        //         System.out.print(i + " ");
        //     } 
        //     System.out.println();
        // }
        
        // // Print Hollow_Rectangle Using Funtion 
        // System.out.print("Enter Rows : ");
        // int Rows = sc.nextInt();
        // System.out.print("Enter Columns : ");
        // int cols = sc.nextInt();
        // Hollow_Rectangle(Rows , cols);

        // // Print Inverted-Rotated Pyramid 
        System.out.print("Enter no Of  Rows : ");
        int RowNo = sc.nextInt();
        // InvRotatedPyramid(RowNo);

        // // Print Inverted-Half-Pyramid 
        // invHalfPyramid(RowNo);
        
        // // Print Floyds Triangle 
        // floydsTriangle(RowNo );
        
        // // Print 0-1 triangle 
        // binTriangle(RowNo);

        // // Print 0-1 triangle 
        // binTriangle2(RowNo);

        // // Print Butterfly
        // butterFly(RowNo);

        // // Print Rhombus 
        // Rhombus(RowNo);

        // // Print hollow Rhombus
        // hollow_Rhombus(RowNo);

        // // Print Diamond 
        // Diamond(RowNo);

        // // Print Number Pattern
        // NumberPattern(RowNo);

        // Print Number Pattern
        numPattern(RowNo);




    }
    
}
