import java.util.*;

class ActivitySelection{
      public static void main(String [] args){
           int start[] = {1,3,0,5,8,5};
           int end[] = {6,4,2,9,7,9};
           Arrays.sort(end);
           int maxAct = 0;
           ArrayList<Integer> ans = new ArrayList<>();
           maxAct = 1;
           ans.add(0);
           int lastEnd = end[0];
           for(int i = 1; i<end.length; i++){
            if(start[i]>= lastEnd){
                  // activity select
                  maxAct++;
                  ans.add(i);
                  lastEnd = end[i];
            }
           }
           System.out.println("max activities =  "+ maxAct);
           for(int i = 0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
           }
           System.out.println();
      }
}