public class DiagonalSum {
    
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        //bruite force
        // for(int i=0 ; i<matrix.length ; i++){
        //     for(int j=0 ; j<matrix[0].length ; j++){
        //         if(i==j){     //Primary Diagonal
        //             sum += matrix[i][j];
        //         }
        //         if(i+j == matrix.length-1){  //Secondary Diagonal
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //Optimise code
        for(int i=0 ; i<matrix.length ; i++){
            //Primary Diagonal
            sum += matrix[i][i];

            //Secondary Diagonal
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
            
        }
        return sum;
    }

    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
         System.out.print(diagonalSum(matrix));
    }
}
