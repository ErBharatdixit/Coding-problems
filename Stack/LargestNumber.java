class LargestNumber{
      public static int largestNumber(int arr[]){
            int largest = arr[0];
            for(int i = 0; i<arr.length; i++){
                  if(largest<arr[i]){
                        largest = arr[i];
                  }
            }
            return largest;
      }
      public static void main(String []args){
            int arr [] = {1,2,3,45,6,3,4,46};
            System.out.print(largestNumber(arr));
      }
}