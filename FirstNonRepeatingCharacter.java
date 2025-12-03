import java.util.*;

public class FirstNonRepeatingCharacter {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            Map<Character,Integer> map = new HashMap<>();

            for(char ch : str.toCharArray()){
                  map.put(ch, map.getOrDefault(ch, 0)+1);
            }

            for(Map.Entry<Character,Integer> entry : map.entrySet()){

                  if(entry.getValue() == 1){
                        System.out.println(entry.getKey());
                        return;
                  }

            }
            System.out.println("we can find first non repeating character");
            
      }
      
}
