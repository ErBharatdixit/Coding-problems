import java.security.KeyStore.Entry;
import java.util.*;

public class PrintMostFrequentWord {

      public static void main(String[] args) {
            Map<String,Integer> map = new HashMap<>();
            String str = "apple banana are my favorite fruit anywhere";
            
            String arr[] = str.split(" ");

            

            
                    
            for(String st : arr){

                  
                  String newword =  ""+st.charAt(0)+ st.charAt(st.length()-1); 
                  
                  map.put(newword,map.getOrDefault(newword,0)+1);




            }

                    String mst = "";

                    int count = 0;

                    for(String key : map.keySet()){
                        if(map.get(key) > count ){
                              count = map.get(key);
                              mst += key;
                        }
                    }
                    System.out.println(mst);
            
      }
      
}
