import java.util.*;
public class MajorityElement {
      public static void main(String[] args) {
            int arr[]  = {1,3,2,5,1,3,1,5,1};
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i<arr.length; i++){
                  //int num = arr[i];

                  // if(map.containsKey(num)){
                  //       map.put(num, map.get(num)+1);
                  // }else{
                  //       map.put(num, 1);
                  // }
                  // OR
                  map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            Set<Integer> keySet =  map.keySet();
            for (Integer key : keySet) {
                  if(map.get(key)>arr.length/3){
                        System.out.println(key);
                  }
                  
            }

      }
}
