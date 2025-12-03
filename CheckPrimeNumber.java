import java.util.*;
public class CheckPrimeNumber {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            boolean isPrime = true;

            for(int i = 2; i*i<=n; i++){
                  if(n % i == 0){
                        isPrime = false;
                  }
            }

            if(isPrime){
                  System.out.println("number "+n+" is prime");
            }else{
                  System.out.println("number " + n + " is not  prime");

            }
            

      }
      
}
