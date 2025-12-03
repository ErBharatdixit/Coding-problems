class PrintSumOf2dArray{
      public static void SumOfSecondRow(int arr[][]){
            int sr = 1;
            int sum = 0;
            for(int i = 0; i<=arr[0].length-1; i++){
                  sum += arr[sr][i];
            }
            System.out.print("the sum of second Row is :"+ sum);
      }

      public static void main(String [] args){
            int arr [][] = {{1,4,9},{11,4,3},{2,2,3}};
           SumOfSecondRow(arr);

      }
}