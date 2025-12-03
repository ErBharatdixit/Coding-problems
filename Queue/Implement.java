 import java.util.*;

class Implement{

      //Using Array
      // static class queue{
      //    static  int arr[];
      //    static  int size;
      //    static  int rear;
      //    static  int front;
      //       queue(int n){
      //             arr = new int[n];
      //             size = n;
      //             rear = -1; 
      //             front = -1;
      //       }
      //       public static boolean isEmpty(){
      //               return rear == -1 && front == -1;
      //       }
      //       public static boolean isfull(){
      //               return (rear + 1)%  size ==  front;
      //       } 
      //       public static void add(int data){
      //             if(isfull()){
      //                   System.out.println(" queue is full");
      //                   return;
      //             }
      //             if(front == -1){
      //                   front = 0;
      //             }
      //             rear = (rear + 1)%size;
      //             arr[rear] = data;

      //       }
      //       public static int remove(){
      //             if(isEmpty()){
      //                   System.out.println(" queue is Empty");
      //                   return -1;


      //             } 

      //                 int result = arr[front];
      //                 // last element 
      //                 if(rear == front){
      //                   rear = front = -1;
      //                 }else{
      //                   front = (front+1)%size;
      //                 }
      //                 return result;

      //       }
      //       public static int peek(){
      //             if(isEmpty()){
      //                     System.out.println(" queue is Empty");
      //                   return -1;
      //             }
      //       return arr[front];

      //       }
      // }

      // Using linkedList
      // static class Node{

      //       int data;
      //       Node next;
      //       Node(int data){
      //             this.data = data;
      //             this.next = null;
      //       }
      // }
      //       static class Queue{
      //             static Node head = null;
      //             static Node tail = null;

      //             public static boolean isEmpty(){
                        
      //                         return head == null & tail == null;
      //                   }
      //                   public static void addLast(int data){
      //                         Node newnode = new Node(data);

      //                         if(head == null){
      //                               head = tail = newnode;
      //                               return;
      //                         }
      //                         tail.next = newnode;
      //                         tail = newnode;
      //                   }
      //                   public static int deletefirst(){
      //                         if(isEmpty()){
      //                               System.out.println("Queue is Empty");
      //                               return -1;
      //                         }
      //                         int front = head.data;

      //                         if(head == tail){
      //                               head = tail = null;
      //                         }else{
      //                         head = head.next;
                              
      //                         }
      //                         return front;

      //                   }
      //                   public static int peek(){
      //                          if(isEmpty()){
      //                               System.out.println("Queue is Empty");
      //                               return -1;
      //                         }
      //                         return head.data;

      //                   }
      //             }

      // using java collection framework
            


      
      public static void main(String [] args){
            //Queue<Integer> q = new LinkedList<>();// 1st method
            Queue<Integer> q = new ArrayDeque<>();// 2nd method

            q.add(5);
            q.add(5);
            q.add(5);
            q.remove(); 
            
            //  Queue q = new Queue();

            //  q.addLast(1);
            //  q.addLast(4);
            //       q.deletefirst();

            //  q.addLast(6);
             while(!q.isEmpty()){
                  System.out.println(q.peek());
                  q.remove();
             }
      }
}