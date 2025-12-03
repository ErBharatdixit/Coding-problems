import java.util.*;
public class Array {

      public static void reverseArray(int [] arr){
            
            int n = arr.length;
            for(int i = 0; i<n/2; i++){
                  int temp = arr[i];
                  arr[i] = arr[n-1-i];
                  arr[n-1-i] = temp;
            }
            for(int num : arr){
                  System.out.println(num+" ");
            }
          
      }
      
      public static int maxElement(int[] arr) {
            int n = arr.length;
              int max = arr[0];
            for(int i = 1; i<n; i++){
                   

                  if(max < arr[i]){
                        max = arr[i];
                  }


            }
            return max;

      }

      public static int getkthsmallestElement(int [] arr){

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int k = 3;

            for(int i = 0; i<arr.length; i++){
                  pq.add(arr[i]);
            }

            for(int i = 1; i<k; i++){
                  pq.poll();
            }

            return pq.peek();

      }
      
      public static int getkthLargestElement(int[] arr) {

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int k = 3;

            for (int i = 0; i < arr.length; i++) {
                  pq.add(arr[i]);
            }

            for (int i = 1; i < k; i++) {
                  pq.poll();
            }

            return pq.peek();

      }

      public static int minElement(int[] arr) {
            int n = arr.length;
            int min = arr[0];
            for (int i = 1; i <n; i++) {

                  if (min > arr[i]) {
                        min = arr[i];
                  } 

            }
            return min;

      }
      public static void main(String[] args) {
            
            int arr [] = {5,7,8,9,4,6,3};
            //reverseArray(arr);
            //System.out.println(maxElement(arr));
            //System.out.println(minElement(arr));
            System.out.println(getkthsmallestElement(arr));
            System.out.println(getkthLargestElement(arr));
      }
      
}
