import java.util.*;
public class OddANDEvenSum {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int m = sc.nextInt();

            int OddSum = 0;

            int EvenSum = 0;

            for(int i=0; i<=m; i++ ){

                  if(i%n == 0){
                        EvenSum +=i;
                  }else{
                        OddSum += i;
                  }



            }
            int result = OddSum-EvenSum;
            System.out.println(OddSum);

            System.out.println("Diffrence is divisible and not divisible by n :"+ result );
            
      }
      
}
