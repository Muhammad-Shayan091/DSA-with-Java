import java.util.*;

public class array {

    public static void updateArray(int Arr[] , int normalNumber) {
        for(int i = 0 ; i < Arr.length ; i++) {
            Arr[i] = Arr[i] + 10;
        }
        normalNumber += 100;
    }

    // LINEAR SEARCH 
    public static int linearSearch(int Arr[] , int target) {
        for(int i = 0 ; i < Arr.length ; i++) {
            if(Arr[i] == target) {
                return i;
            } 
        }
        return -1;
    }

    public static void largest(int Arr[]) {
        int max = Arr[0];
        int min = Arr[0];
        for(int i = 1 ; i < Arr.length ; i++) {
            if(Arr[i] > max) {
                max = Arr[i];
            } else {
                min = Arr[i];
            }
        }
        System.out.println("Maximum Element of Array Is : " + max);
        System.out.println("Minimum Element of Array Is : " + min);
    }

    public static int bSearch(int Arr[] , int target) {
        int st = 0 ;
        int end = Arr.length -1;
        while(st <= end) {
            int mid = (st + (end-st)/2);
            if(Arr[mid] == target) {
                return mid;
            }
            if(Arr[mid] > target) {
                end = mid -1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static int missingNumber(int Array[]){
        int rangeSum = 7*(7+1)/2;
        int arrSum = 0;
        for(int i = 0 ; i < Array.length ; i++) {
            arrSum += Array[i];
        }
        int missNumber = rangeSum - arrSum;
        return missNumber;
    }

    public static void reverseArray(int Arr[]) {
        int st = 0;
        int end = Arr.length - 1;
        while (st < end) {
            int temp = Arr[st];
            Arr[st] = Arr[end];
            Arr[end] = temp;
            st++;
            end--;
        }

    }

    public static void pairs(int Arr[]) {
        for(int i = 0 ; i < Arr.length - 1 ; i++) {
            for(int j = i + 1 ; j <= Arr.length - 1 ; j++) {
                System.out.print(" ( " + Arr[i] + " , " + Arr[j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void subarrays(int Arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for(int i = 0 ; i < Arr.length - 1 ; i++) {
            for(int j = i ; j < Arr.length ; j++) {
                int sum = 0;
                System.out.print("{ ");
                for(int k = i ; k <= j ; k++) {
                    System.out.print(Arr[k] + " ");
                    sum += Arr[k];
                }
                System.out.print("} ");
                System.out.print("-> Sum : " + sum + "  ");
                if(sum > max_sum) {
                        max_sum = sum;
                }
                if(sum < min_sum) {
                    min_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximum Sub-array Sum : " + max_sum);
        System.out.println("Minimum Sub-array Sum : " + min_sum);
    }

    // Maximum Sub-array Sum through Prefix array
    public static void subarrSum(int Arr[]) {
        int Prefix[] = new int[Arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        Prefix[0] = Arr[0];
        // Prefix Array
        for(int i = 1 ; i < Prefix.length ; i++) {
            Prefix[i] = Prefix[i-1] + Arr[i];
        }

        for(int i = 0 ; i < Arr.length ; i++) {
            for(int j = i ; j < Prefix.length ; j++) {
                currSum = i == 0 ? Prefix[j] : Prefix[j] - Prefix[i-1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sub-array Sum : " + maxSum);


    }

    public static void kadanes(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < 0) {
                ms = Math.max(ms, nums[i]);
            }
            
        }
        for(int i = 0 ; i < nums.length ; i++) {
            cs += nums[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum Sub-array Sum : " + ms);
    }

    public static void bestbuysell(int prices[]) {
        int mprofit = Integer.MIN_VALUE;
        int currprofit = 0;
        int bestbuy = prices[0];
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] > mprofit) {
                currprofit = prices[i] - bestbuy;
                mprofit = Math.max(currprofit, mprofit);
            }
            bestbuy = Math.min(prices[i], bestbuy);
        }
        System.out.println("Maximum Profit : " + mprofit);
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        // // Array Creation 
        // int Marks[] = new int[20];
        // // Input Array
        // System.out.print("Enter marks of S1 : ");
        // Marks[0] = sc.nextInt();
        // System.out.print("Enter marks of S2 : ");
        // Marks[1] = sc.nextInt();
        // System.out.print("Enter marks of S3 : ");
        // Marks[2] = sc.nextInt();
        // System.out.print("Enter marks of S4 : ");
        // Marks[3] = sc.nextInt();
        // System.out.print("Enter marks of S5 : ");
        // Marks[4] = sc.nextInt();

        // // Output Array 
        // System.out.println("\nArray before Updation : ");
        // System.out.println("English : " + Marks[0]);
        // System.out.println("Physics : " + Marks[1]);
        // System.out.println("Biology : " + Marks[2]);
        // System.out.println("Chemistry : " + Marks[3]);
        // System.out.println("Mathematics : " + Marks[4]);

        // // Update Array
        // Marks[1] = 87;
        // Marks[2] = 91;
        // Marks[3] = 79;

        // // After Updation 
        // System.out.println("\nArray After Updation : ");
        // System.out.println("English : " + Marks[0]);
        // System.out.println("Physics : " + Marks[1]);
        // System.out.println("Biology : " + Marks[2]);
        // System.out.println("Chemistry : " + Marks[3]);
        // System.out.println("Mathematics : " + Marks[4]);

        // // PASS BY REFERENCE IN ARRAY (Proof)
        // int Arr[] = {2 , 4 , 6};
        // int normalNumber = 10;

        // // Print Original Array
        // System.out.print("Original Array : ");
        // for(int i = 0 ; i < Arr.length ; i++) {
        //     System.out.print(Arr[i] + " ");
        // }
        // System.out.println("\nNumber before Updation : " + normalNumber);
        // updateArray(Arr , normalNumber);

        // // Print Updated Array
        // System.out.print("Updated Array  : ");
        // for(int i = 0 ; i < Arr.length ; i++) {
        //     System.out.print(Arr[i] + " ");
        // }
        // System.out.println("\nNumber After Updation : " + normalNumber);

        // // Linear Search 
        // int boxArray[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // System.out.print("Enter your number : ");
        // int target = sc.nextInt();
        // int Result = linearSearch(boxArray, target);
        // if(Result == -1) {
        //     System.out.println("Element Not found.");
        // } else {
        //     System.out.println("Element Found at Index : " + Result);
        // }

        // // Maximum & Minimum Element Of Array 
        // largest(boxArray);

        // // Binary Search 
        // int Arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // System.out.print("Enter your number : ");
        // int Target = sc.nextInt();
        // int Res = bSearch(Arr, Target);
        // System.out.println("Target Found At index : " + Res);

        // Missing Element in Range
        // int Array[] = {1,2,3,4,5,6};
        // int missNumber = missingNumber(Array);
        // System.out.println("The Missing Number In Range Of Array (1 - 7) Is : " + missNumber);

        // // Reverse an Array 
        // int origArray[] = {1,2,3,4,5,6};
        // System.out.println("Array before Reverse : ");
        // for(int i = 0 ; i < origArray.length ; i++) {
        //     System.out.print(origArray[i] + " ");
        // }
        // reverseArray(origArray);
        // System.out.println("\nArray After Reverse : ");
        // for(int i = 0 ; i < origArray.length ; i++) {
        //     System.out.print(origArray[i] + " ");
        // }

        // // Print Pairs In Array 
        // int pairsArray[] = {1,2,3,4,5,6};
        // pairs(pairsArray);

        int subArray[] = {1,2,3,4,5,6};
        subarrays(subArray);
        subarrSum(subArray);
        int kdarray[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(subArray);
        kadanes(kdarray);
        int bestbuysell[] = {7,1,3,4,5,3};
        bestbuysell(bestbuysell);

        


    }

    

}
