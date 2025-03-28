import java.util.HashMap;

public class FindItineraryFromTickets {
      public static String getStarted(HashMap<String,String> tickets){
            HashMap<String,String> revMap = new HashMap<>();
            for (String key : tickets.keySet() ) {
                  revMap.put(tickets.get(key),key);
                  
            }
            for(String key:tickets.keySet()){
                  if(!revMap.containsKey(key)){
                        return key;
                  }
            }
            return null;
      }
  public static void main(String[] args) {
      HashMap<String,String> tickets = new HashMap<>();
      tickets.put("chennai", "Benguluru");
      tickets.put("Mumbai", "Delhi");
      tickets.put("Goa", "chennai");
      tickets.put("Delhi", "Goa");

      String start = getStarted(tickets);
      System.out.print(start);
      for(String key: tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
      }
   }    
}
