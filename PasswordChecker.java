import java.util.*;

public class PasswordChecker {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String pass = sc.nextLine();
            
            char [] str = pass.toCharArray();

            if( str.length == 0 || str.length < 4){

                  System.out.println("Password is too short");

            }

            if(str[0] >= '0' && str[0] <= '9'){
                  System.out.println("Password is not satisfy a condition ");
            }

            int has_digit = 0;

            int has_upper = 0;

      }

}
