import java.util.*;
;
class MoveHashToForward{

      public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();

            String m1 = "";
            String m2 = "";

            for(char ch : s.toCharArray()){
                  if(ch == '#'){
                        m1 += ch;
                  } else {
                        m2 += ch;   
                  }
            }
            System.out.println(m1+m2);

      }
}