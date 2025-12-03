import java.util.*;

class ReverseNumber{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            // String num = Integer.toString(n);

            // String rev = "";
            
            // for(int i =num.length()-1 ; i>=0; i--){

            //       rev += num.charAt(i);

            // }

            // System.out.println(Integer.parseInt(rev));
            int prev = 0;

            while(n>0){

                  prev = prev*10 + n%10;

                  n = n/10;

            }

            System.out.println(prev);


      }
}