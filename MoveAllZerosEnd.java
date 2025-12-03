import java.util.*;
public class MoveAllZerosEnd {
      public static void main(String[] args) {
            int arr[] = {-1,0,4,0,0,5,7}; // {-1,4,5,7,0,0,0}

            int arr2[] = new int[arr.length];
            int idx = 0;

            for(int i = 0; i<arr.length; i++){
                  if(arr[i] != 0){
                        arr2[idx++] = arr[i];
                  }
            }
            for(int ele : arr2){
                  System.out.println(ele);
            }
            
      }
      
}
