import java.lang.reflect.Array;

public class Divide_Conquer {
    public static void mergSort(int arr[] , int si , int ei){
        if(si>=ei){
            return ;
        }
        int mid = si + (ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;    // for left side
        int j = mid+1; // for right side
        int k = 0;
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        for(k=0 , i = si ; k < temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){
        int Array[] = {2,4,6,1,3,5};
        mergSort(Array, 0, Array.length-1);
        System.out.print("Sorted Array = { ");
        for(int i = 0 ; i < Array.length ; i++){
            System.err.print(Array[i] +" ");
        }
        System.out.print("}");
    }
}
