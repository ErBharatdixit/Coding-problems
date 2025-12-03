import java.util.*;

class BinarySearch{
      public static int binarySearch(int arr[],int key){
               Arrays.sort(arr);
               int start = 0, end = arr.length-1;

               while(start<= end){
                  int mid = (start+end)/2;
                  if(arr[mid] == key){
                        return mid;
                  }
                  if(arr[mid] < key){
                        start = mid+1;
                  }else{
                        end = mid-1;
                  }
               }
               return -1;
            
      }
      public static void main(String []args){
            int arr [] = {1,2,3,45,6,3,4,46};
            int key = 6;
            System.out.print(binarySearch(arr,key));
      }
}