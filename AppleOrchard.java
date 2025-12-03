import java.util.*;


/* Approach 
 * Use two pointers(left, right) to represent window.
 * Use a hashmap to store the frequency of each fruit type in the current window.
 * Expand right pointer step by step 
 * if the number of distinct fruit types exceeds 2, shrink the window from the left until we have at most 2 distinct fruit types.
 * Update the maximum length of the window during the process.
 * 
*/
class AppleOrchard {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of apple trees:");
            int n = sc.nextInt();
            int[] apples = new int[n];
            System.out.println("Enter the number of apples on each tree:");   
            for (int i = 0; i < n; i++) {
                  apples[i] = sc.nextInt();
            }

            System.out.println("Maximum number of apples that can be collected: " + totalApples(apples));

            
      }

      public static int totalApples(int [] apples){

            Map<Integer, Integer> fruitCount = new HashMap<>();
            int left = 0;
            int maxApples = 0;

            for(int right = 0; right<apples.length; right++){
                  fruitCount.put(apples[right], fruitCount.getOrDefault(apples[right], 0) + 1);

                  while(fruitCount.size() > 2){
                        fruitCount.put(apples[left], fruitCount.get(apples[left]) - 1);
                        if(fruitCount.get(apples[left]) == 0){
                              fruitCount.remove(apples[left]);
                        }
                        left++;
                  }

                  maxApples = Math.max(maxApples, right - left + 1);
            }
            return maxApples;
      }

}