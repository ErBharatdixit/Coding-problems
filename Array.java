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
      public static int findMissingNumber1toN(){

            int arr [] = {1,2,4,6,5,7};
            
            int n = maxElement(arr);

            int sum = (n*(n+1))/2;
            int tempSum = 0;

            for(int i = 0; i<arr.length; i++){

                  tempSum += arr[i];
            }

            return sum - tempSum;


      }

      public static int findduplicateElement(){
            int arr [] = {7,5,4,8,7,2};
            for(int i = 0; i<arr.length; i++){
                  for(int j = i+1; j<arr.length; j++){

                        if(arr[i] == arr[j]){
                              return arr[i];
                        }

                  }
            }
            return -1;
      }

      public static void mergedTwoArray(){
            int arr1 [] = {2,5,7,9,10,12};
            int arr2 [] = {1,3,4,8,9,11,13};
            int merged [] = new int [arr1.length+arr2.length];

            int i =0, j = 0, k= 0;
            while(i < arr1.length && j < arr2.length){
                  if(arr1[i] < arr2[j] ){
                        merged[k++] = arr1[i++];
                  }else{
                        merged[k++] = arr2[j++];
                  }
            }
            while(i < arr1.length){
                  merged[k++] = arr1[i++];
            }

            while( j< arr2.length){
                  merged[k++] = arr2[j++];
            }

            for(int num : merged){
                  System.out.println(num +" ");
            }

      }
      public static void rotateArraytoright(){
            int arr[] = {1,2,3,4,5};
            int k = 2;
            
            reverse(arr, 0, arr.length-1);

            reverse(arr, 0, k-1);

            reverse(arr, k, arr.length-1);

            for(int num : arr){
                  System.out.println(num + " ");
            }


            
      }
      public static void reverse(int []arr, int start, int end){
            while(start < end){
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start ++;
                  end--;

            }
      }

      public static int maxSubArray(){
            int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            int maxSum = arr[0];
            int currSum = arr[0];
            for(int i = 1; i<arr.length; i++){

                  currSum  = Math.max(arr[i],currSum+arr[i]);

                  maxSum = Math.max(currSum,maxSum);
            }
            return maxSum;
      }
      public static int Sum(){
            int arr[] = {1,3,7,3,8,5,9,12};
            int sum = 0;
            for(int i = 0; i<arr.length; i++){
                  sum += arr[i];
            }
            return sum;
      }
      public static void main(String[] args) {
            
            int arr [] = {5,7,8,9,4,6,3};
            //reverseArray(arr);
            //System.out.println(maxElement(arr));
            //System.out.println(minElement(arr));
            //System.out.println(getkthsmallestElement(arr));
            //System.out.println(getkthLargestElement(arr));
            //System.out.println(findMissingNumber1toN());
           // System.out.println(findduplicateElement());
            //mergedTwoArray();
            //rotateArraytoright();
            System.out.println(maxSubArray());
      }
      
}
