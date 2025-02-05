class CountValue{

      public static void frequencyofValue(int arr[][], int value){
            int count = 0;
            for(int i = 0; i<arr.length; i++){
                  for(int j = 0 ; j<arr[0].length; j++){
                        if( arr[i][j] == value){
                              count++;
                        }
                  }
            }
            System.out.print("the frequency of given value :"+ count);
      }
      public static void main(String [] args){
            int arr[][] = {{4,7,8},{8,8,7}};
            frequencyofValue(arr,8);
      } 
}