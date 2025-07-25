public class wordBreakProblem {
      static class Node{
            boolean eow = false;
            Node children[] = new Node[26];

            Node(){
                  for(int i = 0; i<26; i++){
                        children[i] = null;
                  }
            }



      }
      public static Node root = new Node();

      public static void insert(String word){
            Node curr = root;
            for(int lable= 0; lable<word.length(); lable++){
                  int idx = word.charAt(lable)-'a';
                  if(curr.children[idx]== null){
                        curr.children[idx] = new Node();
                  }
                  curr = curr.children[idx];


            }
            curr.eow = true;

      }

      public static boolean Search(String key){  // O(L) L=  keyLength
            Node curr = root;
            for( int lable = 0; lable<key.length(); lable++){
             int idx = key.charAt(lable)-'a';

             if(curr.children[idx]== null){
                  return false;
             }
               curr = curr.children[idx];
            }
           return  curr.eow == true;
      }
      public static boolean wordBreak(String key){
            if(key.length() == 0){
                  return true;
            }
            for(int i = 1; i<= key.length(); i++){
                  if(Search(key.substring(0, i)) && wordBreak( key.substring(i))){
                        return true;
                  }
                

                 
            }
            return false;
      }
      public static void main(String[] args) {
            String words [] = {"i","like","sam","samsung","mobile","ice"};
            for(int i = 0; i<words.length; i++){
                  insert(words[i]);
            }
           String key = "ilikesam";

           System.out.println(wordBreak(key));
      }
      
}
