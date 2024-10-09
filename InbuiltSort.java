import java.util.*;

public class InbuiltSort {

    //function that print Sorted Array
    public static void printArr(Integer nums[]){
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i]);
        }
    }


public static void main(String args[]){
    Integer nums[] = {2,4,5,1,0,7};
    //Choose any one and UnComment to Implement Sorting
    // Arrays.sort(nums);  //inbuilt sorting
    // Arrays.sort(nums,0,3);  //inbuilt Indexing sort
    // Arrays.sort(nums,Collections.reverseOrder());  //inbuilt sort in reverse order by only using Object (Integer) for initialise the array
    printArr(nums);
}
    
}