class SpiralMatrix{

      public static void printSpiralMatrix(int arr[][]){
            int n = arr.length;
            int m = arr[0].length;
            int StartRow = 0;
            int StartCol = 0;
            int EndRow = n-1;
            int EndCol = m-1;
           while (StartRow <= EndRow && StartCol <= EndCol){
            // top
             for(int j = StartCol; j<=EndCol; j++){
                   System.out.print(arr[StartRow][j] + " ");
            }
            // right
             for(int i = StartRow+1 ; i<=EndRow; i++){
                   System.out.print(arr[i][EndCol] + " ");
            }
            // bottom
             for(int j = EndCol -1; j>=StartCol; j--){
                   System.out.print(arr[EndRow][j] + " ");
            }
            // left
             for(int i = EndRow -1; i>=StartRow+1; i--){
                   System.out.print(arr[i][StartCol] + " ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
           }



      }
      public static void main(String [] args){
            int arr [][] = {{1, 2, 3},{3, 4, 5},{6, 7, 8}};

            // for(int i = 0; i<arr.length; i++){
            //       for(int j = 0; j<arr[0].length; j++){
            //             System.out.print(arr[i][j]+" ");
            //       }
            //       System.out.println();
            // }
            printSpiralMatrix(arr);

      }
}