import java.util.*;
public class hashmap {
      public static void main(String[] args) {
         HashMap<String,Integer>  hm = new HashMap<>();
         // insert
         hm.put("India", 100) ;
         hm.put("China", 150) ;
         hm.put("Usa", 50) ;
         System.out.println(hm);
         // get
         int population = hm.get("India");
          System.out.println(population);
          // containsKey
          System.out.println(hm.containsKey("India"));
            // Remove
            hm.remove("China");
         System.out.println(hm);
         // size
         System.out.println(hm.size());
         // is Impty
         System.out.println(hm.isEmpty());   
         // Iterate
         Set<String> keys = hm.keySet();
          System.out.println(keys);
          for (String keyValue: keys) {
            System.out.println("key="+ keyValue + " "+ "value="+hm.get(keyValue));
            
          }
      }
      
}
