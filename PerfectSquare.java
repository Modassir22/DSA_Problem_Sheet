import java.util.*;

public class PerfectSquare {
    
    //function that count how many perfect square present in the array
    public static int perfectSquare(int sqr[]){
        int count = 0;

        for(int i=0 ; i<sqr.length ; i++){
            //square of element
            int square = sqr[i] * sqr[i];

            for(int j=0 ; j<sqr.length ; j++){
                //checking perfecr square is available or not in array
                if(square == sqr[j]){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String args[]){
        int sqr[] = {2,4,1,4,3,7};
        System.out.println(perfectSquare(sqr));

    }
}
