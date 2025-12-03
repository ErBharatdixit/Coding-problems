import java.util.*;
public class LinkedHashmap {
      public static void main(String[] args) {
       LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
       // preserve the order of insertion
       
       lhm.put("India",100);
       lhm.put("China",130);
       lhm.put("Usa",50);
       lhm.put("France",40);
       System.out.println(lhm);

       // all operation same for hashmap with the same time complexity

      }
}
