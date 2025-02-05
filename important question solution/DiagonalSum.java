class DiagonalSum{

public static void DiagonalSum(int arr[][]){
      int sum = 0;
      /*   high time complexity tc = o(n*n)  */
      // for(int i = 0; i<arr.length; i++){
      //       for(int j = 0; j<arr[0].length; j++){
      //             if(i == j){ // for primary diagonal
      //                   sum  += arr[i][j];
      //             } else if(i+j == arr.length-1){
      //                   sum += arr[i][j];
      //             }
      //       }
      // }
 /*       tc = o(n) */
      for(int i = 0; i<arr.length; i++){
            //primary
            sum += arr[i][i];
            // secondary

            if(i != arr.length-1-i){
            sum += arr[i][arr.length-i-1];

            }

      }
      System.out.println(sum);

}




 public static void main(String [] args){
            int arr [][] = {{1, 2, 3},{3, 4, 5},{6, 7, 8}};
 DiagonalSum(arr);

 }

}