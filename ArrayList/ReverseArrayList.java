import java.util.ArrayList;
class ReverseArrayList{

      public static void main(String [] args){
            ArrayList<Integer> list = new ArrayList<>();
            // .add() O(1)

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);

            for(int i = list.size()-1; i>=0; i--){
                  System.out.print(list.get(i)+" ");
            }
      }
}