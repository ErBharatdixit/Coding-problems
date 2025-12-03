import java.util.*;

public class CheckAnagram {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str1 = sc.nextLine();

            String str2 = sc.nextLine();

            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if(str1.length() != str2.length()){
                  System.out.println("Not an Anagram");
                  return;
            }

            Map<Character,Integer> map = new HashMap<>();

            for(char ch : str1.toCharArray()){
                  map.put(ch,map.getOrDefault(ch, 0)+1);
            }

            for(char ch : str2.toCharArray()){
                  if(!map.containsKey(ch)){
                        System.out.println("String is not Anagram");
                        return;
                  }
                  map.put(ch, map.get(ch)-1);
            }

            for(int count : map.values()){
                  if(count != 0){
                        System.out.println("String is not An Anagram");
                        return;
                  }
            }
            
            System.out.println("they are anagram");

            

      }
      
}
