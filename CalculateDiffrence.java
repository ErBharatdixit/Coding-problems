import java.util.*;
public class CalculateDiffrence {

      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int n =  sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i<arr.length; i++){
                  arr[i] = sc.nextInt();
            }

            int num = sc.nextInt();

            int diff = sc.nextInt();
            int count = 0;

            for(int i = 0; i<arr.length; i++ ){

                  int x = Math.abs(num-arr[i]);

                  if( x <= diff){
                        count++;
                  }
            }
            System.out.println(count);

      }
      
}
