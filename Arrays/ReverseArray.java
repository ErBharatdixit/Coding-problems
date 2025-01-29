class ReverseArray{
      public static void ReverseArray(int arr[]){
            int first = 0, end = arr.length-1;
            while(first<end){
                  int temp = arr[end];
                     arr[end]  = arr[first];
                     arr[first] = temp;
                     first++;
                     end--; 
            }
            for(int i = 0; i<arr.length; i++){
                  System.out.println(arr[i]);
            }
            System.out.println();
      }
      public static void main (String [] args){
            int arr[] = {2,3,45,6};
            ReverseArray(arr);
      }
}