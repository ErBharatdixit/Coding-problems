  import java.util.*;
class StringODDEVENDiffrence{
      public static void main(String[] args) {

            String str = "aaabbabcdccccccd";

            Map<Character,Integer> map = new HashMap<>();

            for(char ch : str.toCharArray()){

                  map.put(ch,map.getOrDefault(ch, 0)+1);

            }

            
            List<Integer> lst = new ArrayList<Integer>();
            List<Integer> lst1 = new ArrayList<Integer>();
                  
             

            for(int val : map.values()){
            if(val%2 !=0){
                  lst.add(val);
            }else{
                  lst1.add(val);
            }
                  

            }
               lst.sort(null);
               lst1.sort(null);

               int ans = lst.get(lst.size()-1) - lst1.get(0);
               System.out.println(ans);

            
            
      }

}