import java.util.*;
class FormLargestNumber{
      public static void main(String[]args){

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

         List<Integer> lst = new ArrayList<>();

         while(n>0){

            int num = n%10;
            n = n/10;

            lst.add(num);
         }
         
         Collections.sort(lst,Collections.reverseOrder());
           String res = "";
         for(int i = 0; i<lst.size(); i++){

              res +=lst.get(i);

         }
         
         System.out.println(res);

           

      }
}