import java.util.*;
public class Hashset {
  public static void main(String[] args) {
      HashSet<Integer> hs = new HashSet<>();
      hs.add(3);
      hs.add(4);
      hs.add(5);
      hs.add(6);
      hs.add(7);
      hs.add(7);
      // for iteration
      Iterator it = hs.iterator();
      while(it.hasNext()){
            System.out.println(it.next());
      }
      // advance loop
      for (Integer value : hs) {
            System.out.println(value);
            
      }
      // System.out.println(hs);
      // System.out.println(hs.contains(3));
      // System.out.println(hs.size());
      // hs.clear();
      // System.out.println(hs.isEmpty());
      LinkedHashSet<String> cities =  new LinkedHashSet<>();
      // maintain the insertion order and all operation same as Hashset
      cities.add("Delhi");
      cities.add("Chennai");
      cities.add("Mumbai");
      cities.add("Loucknow");
      System.out.println(cities);

      TreeSet<String> ts = new TreeSet<>();
      // insert an ascending order
      ts.add("Delhi");
      ts.add("Chennai");
      ts.add("Mumbai");
      ts.add("Loucknow");
      System.out.println(ts);
}    
}
