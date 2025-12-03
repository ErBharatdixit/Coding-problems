import java.util.*;
public class ArmStrongNumber {

      public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();

      String str = Integer.toString(n);

      int pow = str.length();

      int result = 0;

      for(int i = 0; i<str.length(); i++){

            int num = (str.charAt(i))-'0';

            result += Math.pow(num,pow);

      }
      
      if( result == n){
            System.out.println("numger is follow armstrong number rule");
      }else{
            System.out.println("numger is not follow armstrong number rule");

      }
            
      }
      
}
