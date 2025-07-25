public class tries {
      static class Node {
            boolean eow = false;
            Node[] children = new Node[26];

            Node() {
                  for (int i = 0; i < 26; i++) {
                        children[i] = null;
                  }

            }
      }

      public static Node root = new Node();

      public static void insert(String word) { // tc=O(L)
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                  int idx = word.charAt(level) - 'a';
                  if (curr.children[idx] == null) {
                        curr.children[idx] = new Node();

                  }
                  curr = curr.children[idx];
            }
            curr.eow = true;
      }

      public static boolean Search(String key) { // tc- O(L)
            Node curr = root;
            for (int lable = 0; lable < key.length(); lable++) {
                  int idx = key.charAt(lable) - 'a';

                  if (curr.children[idx] == null) {
                        return false;
                  }
                  curr = curr.children[idx];
            }
            return curr.eow == true;
      }

      public static void main(String[] args) {
            String words[] = { "the", "a", "their", "there", "any", "thee" };

            for (int i = 0; i < words.length; i++) {

                  insert(words[i]);
            }
            System.out.println(Search("thei"));
            System.out.println(Search("theo"));
      }

}
