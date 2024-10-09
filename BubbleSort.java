public class BubbleSort {
    

    //Performing Bubble Sort
    public static void bubbleSort(int nums[]){
        for(int turn=0 ; turn<nums.length-1 ; turn++){
            int swap = 0;
            for(int j=0 ; j<nums.length-1-turn ; j++){
                if(nums[j] > nums[j+1] && swap>=0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    //Print the sorted element
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        bubbleSort(nums);
        printArr(nums);
       
    }
}
