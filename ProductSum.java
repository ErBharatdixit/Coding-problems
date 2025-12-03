import java.util.*;

public class ProductSum {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                  arr[i] = sc.nextInt();
            }
            int sum = sc.nextInt();

            Arrays.sort(arr);

            int check = arr[0]+arr[1];

            int product = 0;

            if(check <= sum){

                  product = arr[0]*arr[1];
                  
            }

            System.out.println(product);
            
      }
      
}
