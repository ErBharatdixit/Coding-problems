      import java.util.ArrayList;
      import java.util.Collections;



class MethodOFArrayList{

      public static void main(String [] args){
            ArrayList<Integer> list = new ArrayList<>();
            // .add() O(1)

            list.add(1);
            list.add(7);
            list.add(3);
            list.add(8);
            list.add(5);
            list.add(22);
            list.add(7);

            list.add(1,9); // O(n)
            System.out.println(list);

            // Get Element )   O(1)

            int element = list.get(0);
            System.out.println(element);
            // Delete  O(n)

            list.remove(2);
            System.out.println(list);
// set element at index   O(n)
list.set(2,10);
            System.out.println(list);
   // contains Element


   
            System.out.println(list.contains(11));

            // size of arrayList
            System.out.println(list.size());

  // for sorting 

  Collections.sort(list); // ascending order
            System.out.println(list);
  Collections.sort(list, Collections.reverseOrder()); // descending order
            System.out.println(list);


            // create a 2-d array list

            ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            mainList.add(list1);
            ArrayList<Integer> list2 = new ArrayList<>();
             list2.add(1);
            list2.add(2);
            list2.add(3);
            mainList.add(list2);

for(int i = 0; i<mainList.size(); i++){
      ArrayList<Integer> currList = mainList.get(i);
      for(int j = 0; j<currList.size(); j++){
            System.out.println(currList.get(j)+" ");


      }
            System.out.println();

}
            System.out.println(mainList);






      }
}
