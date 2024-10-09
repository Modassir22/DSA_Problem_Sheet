public class InsertionSort {
    
       //Insertion Sort Algorithm
       public static void insertionSort(int nums[]){
        for(int i=1 ; i<nums.length ; i++){
            int Curr = nums[i];
            int Prev = i-1;
            //Finding out the correct position to insert
            while(Prev >= 0 && nums[Prev] > Curr){
                nums[Prev+1] = nums[Prev];
                Prev--;
            }
            //Insertion
            nums[Prev+1] = Curr;
        }
       }

       //Print the sorted array
       public static void printArr(int nums[]){
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
       }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        insertionSort(nums);
        printArr(nums);
    }
}
