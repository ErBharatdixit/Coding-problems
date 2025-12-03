class MaxSubarrayII{
      public static void maxSumSubArray(int arr[]){
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[arr.length];
            // calculate prefix
            prefix[0] = arr[0];
            for(int i = 0; i<prefix.length; i++){
                  prefix[i] = prefix[i-1]+arr[i];
            }
            for(int i = 0; i<arr.length; i++){
                  int start = i;
                  for(int j = i; j<arr.length; j++){
                        int end = j;
                        sum = start == 0? prefix[end]: prefix[end] - prefix[start-1];
                      
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