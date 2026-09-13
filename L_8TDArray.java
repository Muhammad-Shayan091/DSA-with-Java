import java.util.*;
public class TDArray {
    public  static void spiralMatrix(int Arr[][]) {
    int str = 0;
    int endr = Arr.length-1;
    int stc = 0;
    int endc = Arr[0].length-1;
    while (str <= endr && stc <= endc) {
        // top row
        for(int i = stc; i <= endc ; i++) {
            System.out.print(Arr[str][i] + " ");
        }
        
        // Right column
        for(int i = str + 1 ; i <= endr ; i++) {
            System.out.print(Arr[i][endc] + " ");
        }

        // bottom row 
        for(int i = endc-1; i >= stc ; i--) {
            if(str == endr) {
                break;
            }
            System.out.print(Arr[endr][i] + " ");
        }

        // left column 
        for(int i = endr-1 ; i >= str+1 ; i--) {
            if(stc == endc) {
                break;
            }
            System.out.print(Arr[i][stc] + " ");
        }
        str++;
        stc++;
        endr--;
        endc--;
        }
    }

    public  static  void diagonalSum(int Arr[][]) {
        int sum = 0;
        for(int i = 0 ; i < Arr.length ; i++){
            for(int j = 0 ; j < Arr[0].length ; j++) {
                if(i == j) {
                    sum += Arr[i][j];
                }
                if((i+j) == (Arr.length-1)) {
                    if(i==j){
                        continue;
                    }
                    sum += Arr[i][j];
                }
            }
        }
        System.out.println("\nDiagonal Sum : " + sum);
    }

    public  static  void  optDiagonalSum(int Arr[][]) {
        int sum = 0;
        for(int i = 0 ; i < Arr.length ; i++){
            // Primary Diagonals 
            sum += Arr[i][i]; 
            // Secondary Diagonals   Condition :-> (i+j == n-1 then j = n-i-1)
            if(i==Arr.length-i-1) {
                continue;
            }
            sum += Arr[i][Arr.length-i-1];  
        }
        System.out.println("Diagonals Sum : " + sum);
    }

    public  static boolean search(int Arr[][],int key) {
        for(int i = 0 ; i < Arr.length ; i++) {
            for(int j = 0 ; j < Arr[0].length ; j++){
                if(Arr[i][j] == key) {
                    System.out.println("Key Found At : ("+i+","+j+")");
                    return  true;
                }
            }
        }
        System.out.println("Target Not Found..");
        return false;
    }
    public static boolean staircase(int Arr[][] , int key) {
        int Row = Arr.length - 1;
        int col = 0;
        while (Row >= 0 && col < Arr[0].length) {
            if(Arr[Row][col] == key) {
                System.out.println("Key Found At : ("+Row+","+col+")");
                return  true;
            } else if(key > Arr[Row][col]) {
                col++;
            } else {
                Row--;
            }
        }
        System.out.println("Target Not Found!..");
        return false;
    }

    public static void  countKey(int Arr[][] , int key) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i< Arr.length ; i++) {
            for(int j = 0; j < Arr[0].length ; j++) {
                if(Arr[i][j] == key) {
                    count++;
                }
                if(i == 1) {
                    sum += Arr[i][j];
                }
            }
        }
        System.out.println(key + " : Is Present : " +count+ " : times In Array!");
        System.out.println("Sum Of Second Array Is : " + sum);
    }

    public static void transpose(int Arr[][]) {
        for(int i = 0 ; i < Arr.length ; i++) {
            for(int j = 0 ; j < Arr[0].length ; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

        int tranArray[][] = new int[Arr[0].length][Arr.length];
        for(int i = 0 ; i < Arr.length ; i++) {
            for(int j = 0 ; j < Arr[0].length ; j++) {
                tranArray[j][i] = Arr[i][j];
            }
        }

        System.out.println();
        for(int i = 0 ; i < tranArray.length ; i++) {
            for(int j = 0 ; j < tranArray[0].length ; j++) {
                System.out.print(tranArray[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // // Defining a 2D-array 
        // int array [][] = new int[3][3];

        // // Input Element in 2D-array
        // for(int i = 0 ; i < array.length ; i++) {
        //     for(int j = 0 ; j < array[0].length ; j++){
        //         System.out.print("Enter "+"("+ i + "," + j + ")" + " Number : ");
        //         array[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        // // Print 2D-array 
        // for(int i = 0 ; i < array.length ; i++) {
        //     for(int j = 0 ; j < array[0].length ; j++){
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // int Arr[][] = {
        //     {1, 2, 3, 4, 17},
        //     {5, 6, 7, 8, 18},
        //     {9,10,11,12, 19},
        //     {13,14,15,16,20},
        //     {21,22,23,24,25}
        // };
        // spiralMatrix(Arr);
        // diagonalSum(Arr);
        // optDiagonalSum(Arr);

        // int sortedMatrix[][] = {
        //     {10,20,30,40},
        //     {15,25,35,35},
        //     {27,29,37,48},
        //     {32,33,39,50}
        // };

        // search(sortedMatrix,30);       //(O(n^2))
        // staircase(sortedMatrix, 30);   //(O(m+n))

        // Practice Questions
        int Arr[][] = {
            {1,2,3},
            {3,5,6},
            {3,6,9}
        };
        countKey(Arr, 3);

        int Matrix[][] = {
            {2,3,7},
            {5,6,7}
        };
        transpose(Matrix);









        


    }
}