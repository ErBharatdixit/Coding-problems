public class FindLargestNumberInAnArray {
      public static void main(String[] args) {
            int arr [] = {2,4,3,9,7,86,5};

            int max_value = arr[0];

            for(int i = 0; i<arr.length; i++){
                  if(arr[i]>max_value){
                        max_value = arr[i];
                  }
            }
            System.out.println(max_value);
      }
      
}
