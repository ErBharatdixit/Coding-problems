class LinkedList {
      
      public static class Node {
            int data;
            Node next;

            public Node(int data) {
                  this.data = data;
                  this.next = null;
            }
      }

      public static Node head;
      public static Node tail;
      public static int size;
      // add first

      public void addFirst(int data) {
            // create newNode
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                  head = tail = newNode;
            }else{
                  // step 2
                  newNode.next = head;
                  head = newNode;

            }
           
      }

      // AddLAst

      public void AddLast(int data) {
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                  head = tail = newNode;
            }else{
                  // step 2
                  tail.next = newNode;
                  tail = newNode;

            }

            
      }

      // traverse linkedList
      public void traverse() {
            Node temp = head;

            while (temp != null) {
                  System.out.print(temp.data + "->");

                  temp = temp.next;
            }
            System.out.println("null");
      }
      // insert in the middle
      public void InsertMiddle(int idx , int data){
            Node newNode = new Node(data);

            if(idx == 0){
            addFirst(data);
            return;
            }

            size++;
            Node temp = head;

            int i = 0;
            while(i < idx-1){
                  temp = temp.next;
                  i++;


            }
            newNode.next = temp.next;
            temp.next= newNode;
      }
      // removeFirst
      public int removeFirst(){
            if(size == 0){
                  return -1;
            } else if(size == 1){
                  int val = head.data;

                  head= tail= null;
                  size = 0;

                  return val;
            }

            int temp = head.data;

            head = head.next;
            size--;

            return temp;
      }

      // removeLast
      public int removeLast(){
            if (size == 0) {
                  return -1;
            } else if (size == 1) {
                  int val = head.data;

                  head = tail = null;
                  size = 0;

                  return val;
            }
              // prev: size-2;
            Node prev = head;
            for(int i = 0; i<size-2; i++){
                  prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            size--;
            tail = prev;
            return val;

      }
       // iterative approach
           
      public int itrSearch( int key){
            if(size == 0){
                  System.out.println("ll is empty");
                  return -1;
            }
            Node temp = head;
            int i = 0;
            while(temp != null){

                  if(temp.data == key){
                        return i;
                  }
                  temp = temp.next;
                  i++;
            }
            return -1;

      }
      // reverse linkedList

      public void reverseLinkedList(){
            Node curr = tail= head;
            Node prev = null;
            Node next;

            while(curr != null){
                  next = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = next;
            }
            head = prev;

      }

      // find & remove Nth node from End

      public void deleteNthfromEnd(int n){

            // delete node from end logic is delete node size-n+1 from start
         
            Node temp = head;

            if(size == n){
            head = head.next;
            size--;
            return;
          }
          // sz-1

          int i = 1;

          int iToFind = size-n;

          while(i<iToFind){
            temp = temp.next;
            i++;
          }
          temp.next = temp.next.next;
          size--;
          return;



          }
          // slow and fast approach for find middle node
          public Node findMid(Node head){

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                  slow = slow.next;
                  fast = fast.next.next;
            }
            return slow;
          }
          // check palindrome 

          public boolean checkpalindrome(){
            if(head == null || head.next == null){
                  return true;
            }

            // step 1 find mid
              Node miNode = findMid(head);
              // reverse second half

              Node prev = null;
              Node curr = miNode;
              Node next;

              while( curr != null){

                  next = curr.next;
                  curr.next = prev;
                   prev = curr;
                   curr = next;

              }
              Node right = prev; 
              Node left = head;

              while(right != null){
                  if(left.data != right.data){
                        return false;

                  }
                  left = left.next;
                  right = right.next;
              }
              return true;

          }

      

      public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(1);
            //ll.AddLast(1);
           // ll.AddLast(9);
           // ll.InsertMiddle(2, 5);
            ll.traverse();
           System.out.println(ll.checkpalindrome());
            ll.reverseLinkedList();
           ll. deleteNthfromEnd(3);
            ll.traverse();

            System.out.println("size is : " + size);

      }

}

