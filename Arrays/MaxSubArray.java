class MaxSubArray{
      public static void maxSumSubArray(int arr[]){
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++){
                  int start = i;
                  for(int j = i; j<arr.length; j++){
                        int end = j;
                        sum = 0;
                        for(int k = start; k<=end; k++){
                      sum += arr[k];
                  

                        }
                        System.out.println(sum);
                        if(maxSum < sum){
                              maxSum = sum ;
                        }
                  


                  }

            }
                  System.out.println("max sum "+ maxSum);

      }
      public static void main(String [] args){
            int arr [] = {2,4,6,8,10};
            maxSumSubArray(arr);
      }
}