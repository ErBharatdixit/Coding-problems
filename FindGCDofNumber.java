import java.util.*;
public class FindGCDofNumber {
      public static int GCD(int num1, int num2){
            if(num2 == 0){
                  return num1;
            }

           return  GCD(num2, num1%num2);

      
            
      }

      public static int LCm(int num1, int num2){
            int max = Math.max(num1,num2);

            int lcm = max;

            while(true){
                  if(lcm % num1 == 0 && lcm % num2 == 0){

                        return lcm;

                        
                  }

                  lcm++;
            }
            
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();

            int num2 = sc.nextInt();
             
            System.out.println(GCD(num1, num2));
            System.out.println(LCm(num1, num2));
            int gcd = 1;

            for(int i = 2; i<Math.min(num1,num2); i++){
                  

                  if(num1 % i == 0 && num2 % i == 0 ){

                        gcd = i;
                  }
            }
            System.out.println("the greatest common deviser is "+ gcd);


            // if we find LCM then formula is: (LCM*GCD = num1*num2);
            
      }
      
}
