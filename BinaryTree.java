class BinaryTree{
      static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                  this.data = data;
                  this.left = null;
                  this.right = null;
            }

      }
      static class Binarytree{
            public static Node buildTree(int nodes[]){

            }
      }
      public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binarytree tree = new Binarytree();
            Node root = tree.buildTree(nodes);
      }
}