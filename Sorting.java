import java.lang.reflect.Array;

public class Sorting {

    public static void bubbleSort(int Arr[]){
        int Swap = 0;
        for(int round = 0 ; round < Arr.length ; round++){
            Swap = 0;
            for(int j = 0 ; j < Arr.length - 1 - round ; j++){
                if(Arr[j] > Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                    Swap++;
                }
            }
            System.out.println("Swapping : "+Swap);
            if(Swap <= 0){
                break;
            }
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void SelectionSort(int Arr[]){
        for(int i = 0 ; i < Arr.length-1 ; i++){
            int maxPos = i;
            for(int j = i+1 ; j < Arr.length ; j++){
                if(Arr[maxPos] > Arr[j]){
                    maxPos = j;
                }
            }
            int temp = Arr[i];
            Arr[maxPos] = Arr[i];
            Arr[i] = temp;
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void InsertionSort(int Arr[]){
        for(int i = 1 ; i < Arr.length ; i++){
            int Prev = i-1;
            int curr = Arr[i];
            while (Prev >= 0 && Arr[Prev] > curr) {
                Arr[Prev+1] = Arr[Prev];
                Prev--;
            }
            Arr[Prev+1] = curr;
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void countSort(int Arr[]){
        // To Find Largest Element for Range 
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < Arr.length ; i++){
            largest = Math.max(largest, Arr[i]);
        }

        // To Create count Array for Range 
        int count[] = new int[largest+1];
        for(int i = 0 ; i < Arr.length ; i++){
            count[Arr[i]]++;
        }

        // Sorting
        int curr = 0;
        for(int i = 0 ; i < count.length ; i++){
            while (count[i] > 0) {
                Arr[curr] = i;
                curr++;
                count[i]--;
            }
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    // Assignment Problem On Sorting Algo's for sorting in descending Order
    public static void bubbleSort_Desc(int Arr[]){
        for(int i = 0 ; i < Arr.length ; i++) {
            for(int j = 0 ; j < Arr.length-1-i ; j++){
                if(Arr[j] < Arr[j+1]){
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void SelectionSort_Desc(int Arr[]){
        for(int i = 0 ; i < Arr.length-1 ; i++){
            int curr = i;
            for(int j = i+1 ; j < Arr.length ; j++){
                if(Arr[curr] < Arr[j]){
                    curr = j;
                }
            }
            int temp = Arr[curr];
            Arr[curr] = Arr[i];
            Arr[i] = temp;
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void InsertionSort_Desc(int Arr[]){
        for(int i = 1 ; i < Arr.length ; i++){
            int curr = Arr[i];
            int Prev = i-1;
            while (Prev>0 && Arr[Prev]<curr){
                Arr[Prev+1] = Arr[Prev];
                Prev--;
            }
            Arr[Prev+1] = curr;
        }
        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }

    public static void countSort_Desc(int Arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < Arr.length ; i++){
            largest = Math.max(largest, Arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0 ; i < Arr.length ; i++){
            count[Arr[i]]++;
        } 

        int curr = 0;
        for(int i = count.length-1 ; i >= 0 ; i--){
            while (count[i]>0) {
                Arr[curr] = i;
                curr++;
                count[i]--;
            }
        }

        System.out.print("Array = { ");
        for(int i = 0 ; i < Arr.length ; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.print("}");
    }


    public static void main(String[] args) {
        // int Arr[] = {5,3,4,1,2};
        // System.err.println("Bubble Sort : ");
        // bubbleSort(Arr);
        // System.err.println("\nSelection Sort : ");
        // SelectionSort(Arr);
        // System.err.println("\nInsertion Sort : ");
        // InsertionSort(Arr);
        // System.err.println("\nCounting Sort : ");
        // int countArray [] = {1,2,3,1,2,3,4,6,8,7,9,9,1};
        // countSort(countArray);

        System.out.println("Print Array in Descending Order : ");
        int Array[] = {3,6,2,1,8,7,5,3,1};
        // System.err.println("Bubble Sort : ");
        // bubbleSort_Desc(Array);
        // System.err.println("\nSelection Sort : ");
        // SelectionSort_Desc(Array);
        // System.err.println("\nInsertion Sort : ");
        // InsertionSort_Desc(Array);
        System.err.println("\nCounting Sort : ");
        countSort_Desc(Array);
    }
    
}
