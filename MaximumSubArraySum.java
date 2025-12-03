import java.util.*;
public class MaximumSubArraySum {
      public static void main(String[] args) {
            
            int arr[] = {4,2,-4,7,-8,9,-5,-3};

            int maxSofar = arr[0];

            int maximunEndinghere = arr[0];

            for(int i = 1; i<arr.length; i++){

                  maximunEndinghere = Math.max(arr[i],maximunEndinghere+arr[i]);

                  maxSofar = Math.max(maxSofar,maximunEndinghere);

            }
            System.out.println(maxSofar);
      }
      
}
