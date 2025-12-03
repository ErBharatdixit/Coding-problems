import java.util.*;
class PasswordChecker2{

      public static boolean isvalidPassword(String pass){
            if(pass.length()<6){
                  return false;

            }

            if(pass.contains("/") ||
            pass.contains(" "))return false;

            boolean  isdigit = false;
            boolean isUppercase = false;
            boolean isLowercase = false;

            for( char ch : pass.toCharArray()){
                  if(Character.isUpperCase(ch)) isUppercase = true;
                  if(Character.isLowerCase(ch)) isLowercase = true;
                  if(Character.isDigit(ch)) isdigit = true;
            }

            return isUppercase && isLowercase && isdigit;
      }
      
      public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String pass = sc.nextLine();

            if(isvalidPassword(pass)){
                  System.out.println("valid password");
            }else{

                  System.out.println("Invalid password");

            }

            

            
      }
}