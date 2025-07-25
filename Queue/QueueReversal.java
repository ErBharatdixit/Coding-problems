import java.util.*;
import java.util.LinkedList;
class QueueReversal{
      public static void queuereverse(Queue<Integer> q){
            Stack<Integer> s = new Stack<>();
            while(!q.isEmpty() ){
                  s.push(q.remove());

            }
            while(!s.isEmpty() ){
                  q.add(s.pop()); 

            }
      }
      public static void main(String [] args){
            Queue<Integer> q = new LinkedList<>();
             q.add(6);
            q.add(7);
            q.add(8);
            q.add(9);
            q.add(10);
            queuereverse(q);

            while(!q.isEmpty()){
                  System.out.print(q.peek()+"  ");
                  q.remove();
            }
      }
}