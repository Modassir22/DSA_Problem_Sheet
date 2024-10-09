import java.util.*;

public class CountingSort {
    
     
    public static void countingSort(int nums[]){
        //finding the range of element
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            largest = Math.max(largest,nums[i]);
        }

        //finding the frequency of each element (means how many single element present in an array)
        int count[] = new int[largest + 1]; //here we take length of count is largest+1 because we start from 0
        for(int i=0 ; i<nums.length ; i++){
            count[nums[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]){
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
     int nums[] = {1,4,1,3,2,4,3,7};
     countingSort(nums);
     printArr(nums);

      }
    }
