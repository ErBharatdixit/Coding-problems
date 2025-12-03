import java.util.*;

public class ConvertDecimalNumberToBinary {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            List<Integer> lst = new ArrayList<>();
            
            int rem = 0;
            boolean con = true;
            while(con){

                  rem = n%2;

                  n = n/2;

                  lst.add(rem);

                  if(n == 0){
                        con = false;
                  }

            }

            int arr[] = new int[lst.size()];
          int i = 0;
            for(int ele : lst){
                  arr[i] = ele;
                  i++;

            }

                  for(int j = arr.length-1; j>= 0; j--){
                        System.out.print(arr[j]);

                  }

            
      }
      
}
