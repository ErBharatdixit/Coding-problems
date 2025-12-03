import java.util.*;
public class AddEvenOdd {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i<arr.length; i++){
                  arr[i] = sc.nextInt();
            }
            List<Integer> lst1 = new ArrayList<>();
            List<Integer> lst2 = new ArrayList<>();
            for(int i = 0; i<arr.length; i++){

                  if(i % 2 != 0){
                        lst1.add(arr[i]);
                  }else{
                        lst2.add(arr[i]);
                  }
            }

            Collections.sort(lst1);
            Collections.sort(lst2);
            System.out.println(lst1);
            System.out.println(lst2);


            int result = lst1.get(lst1.size()-2)+lst2.get(1);
            System.out.println(result);
            
      }
      
}
