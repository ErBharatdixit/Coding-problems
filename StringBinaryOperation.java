 import java.util.*; 

public class StringBinaryOperation {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            /*
             * -A denotes AND operation
             * -B denotes OR operation
             * -C denotes XOR operation
             */
            
             int res = str.charAt(0)-'0';
             for(int i = 1; i<str.length();){

                  char prev = str.charAt(i);

                  i++;

                  if(prev == 'A'){
                        res = res&(str.charAt(i)-'0'); 
                  }else if(prev == 'B'){
                        res = res | (str.charAt(i) - '0');
                  }else{
                        res = res ^ (str.charAt(i) - '0'); 
                  }
                     i++;

                     
             }
             System.out.println(res);
      }
      
}
