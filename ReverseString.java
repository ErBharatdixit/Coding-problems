import java.util.*;
public class ReverseString {

      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            String rev = "";

            // for(int i = str.length()-1; i>=0;  i--){

            //       rev += str.charAt(i);

            // }

            Stack<Character> st = new Stack<>();
            for(char ch : str.toCharArray()){
                  st.addElement(ch);
            }

            while(!st.isEmpty()){
                  rev += st.pop();

                  
            }

            System.out.println(rev);
      }
      
}
