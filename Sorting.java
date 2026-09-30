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

    public static void main(String[] args) {
        int Arr[] = {5,3,4,1,2};
        System.err.println("Bubble Sort : ");
        bubbleSort(Arr);
        System.err.println("\nSelection Sort : ");
        SelectionSort(Arr);
        System.err.println("\nInsertion Sort : ");
        InsertionSort(Arr);
    }
    
}
