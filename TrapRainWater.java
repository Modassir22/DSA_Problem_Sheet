import java.util.*;

public class TrapRainWater {

    //function that calculte trapeed water between building
    public static int trappedRainWater(int height[]){
        //claculate left max boundary - using array form
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1 ; i<height.length ; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        //calculate right max boundary - using array form
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        
        int trappedWater = 0;
        //loop
         for(int i=0 ; i<height.length ; i++){
            //water level = min(leftmax boundry , rightMax boundary);
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);
            //trappedWater = waterlevel - height[i];
            trappedWater += waterLevel - height[i];
         }
       return trappedWater;
    }


    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));

        
        
    }
}
