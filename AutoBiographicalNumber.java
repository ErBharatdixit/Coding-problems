import java.util.*;
public class AutoBiographicalNumber {
      public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

               String n = sc.nextLine();

               char [] arr = n.toCharArray();
               int count = 0;
               int num = 0;

               for(int i = 0; i<arr.length; i++){
                   
                   num = arr[i]-'0';

                  if(num !=0){
                        count++;
                  }
                    
               }
               System.out.println(count);
      }
      
}
