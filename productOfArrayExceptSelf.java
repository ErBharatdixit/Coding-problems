import java.util.*;
public class productOfArrayExceptSelf {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i<n; i++){
                  arr[i] = sc.nextInt();
            }
            int output [] = new int[n];
            int left = 1;

            for(int i = 0; i<n; i++){
                  output[i] = left;

                  left = left*arr[i];
            }
            
            int right = 1;

            for(int i = n-1; i>=0; i--){
                  output[i] = output[i]*right;
                  right = right*arr[i];
            }

            for(int i = 0; i<n; i++){
                  System.out.print(output[i]+" ");
            }
      }
      
}
