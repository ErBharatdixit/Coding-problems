import java.util.LinkedList;

public class ImplementQueueAndStackUsingLinkedList {


      LinkedList<Integer> lst = new LinkedList<>();

      // for stack 

      public void push(int data){

            if(lst.isEmpty()){
                  lst.add(data);
            }else{
                  lst.addLast(data);
            }

            
      }
      public int pop(){

            if(lst.isEmpty()){
                  return -1;
            }else{

                  return lst.removeLast();
            }
      }

      public int peekInStack(){
            if(lst.isEmpty()){

                  return -1;
            }else{
               return    lst.getLast();
            }
      }
      
      public void displayStack() {
            System.out.println(lst);
      }


      // for Queue Implementation

      public void enqueu(int data){

            if(lst.isEmpty()){
                  lst.add(data);
            }else{
                  lst.addLast(data);
            }
      }

      public int dequeue(){

            if(lst.isEmpty()){
                  return -1;
            }else{
                  return lst.removeFirst();
            }
      }

      public int peekInQueue(){

            if(lst.isEmpty()){
                  return -1;
            }else{
                  return lst.getFirst();
            }
      }
      public void displayQueue(){
            System.out.println(lst);
      }

      

public static void main(String[] args) {

      ImplementQueueAndStackUsingLinkedList list = new ImplementQueueAndStackUsingLinkedList();

      list.push(10);
      list.push(20);
      list.pop();
      list.push(100);
      list.push(40);
      System.out.println(list.peekInStack());
      list.displayStack();

      list.enqueu(23);
      list.enqueu(213);
      list.dequeue();
      list.enqueu(231);
      System.out.println(list.peekInQueue());

      list.displayQueue();


      
      
      

}

      
}
