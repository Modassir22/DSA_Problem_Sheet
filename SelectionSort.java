public class SelectionSort {

    //Performing Selection sort
    public static void selectionSort(int nums[]){
        for(int i=0 ; i<nums.length-1 ; i++){
            int minPos = i;
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[minPos] > nums[j] ){
                    minPos = j;
                }
            }
            //Swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    //Print the sorted element
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = {5,7,9,6,3,2,0,1,4,8};
        selectionSort(nums);
        printArr(nums);
       
    }
}

