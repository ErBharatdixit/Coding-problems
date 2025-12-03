import java.util.*;
public class BinaryToDecimal {
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();

            int decimal = 0;

            int power = 0;

            for(int i = input.length()-1; i>=0; i--){

                  char bit = input.charAt(i);
                  if(bit == '1'){
                        decimal += Math.pow(2,power);
                  }
                  power++;
            }
            
            System.out.println(decimal);

      }
      
}
