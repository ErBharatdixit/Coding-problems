import java.util.*;  

class QueueUsing2Stack {  
    static class queue {  
        static Stack<Integer> s1 = new Stack<>();  
        static Stack<Integer> s2 = new Stack<>();  

        public static boolean isEmpty() {  
            return s1.isEmpty();  
        }  

        public static void add(int data) {  
            // Move all elements from s1 to s2  
            while (!s1.isEmpty()) {  
                s2.push(s1.pop());  
            }  
            // Push the new element onto s1  
            s1.push(data);  
            // Move all elements back from s2 to s1  
            while (!s2.isEmpty()) {  
                s1.push(s2.pop());  
            }  
        }  

        public static int remove() {  
            if (isEmpty()) {  
                System.out.println("Queue is empty");  
                return -1; // Indicates error  
            }  
            return s1.pop();  
        }  

        public static int peek() {  
            if (isEmpty()) {  
                System.out.println("Queue is empty");  
                return -1; // Indicates error  
            }  
            return s1.peek();  
        }  
    }  

    public static void main(String[] args) {  
        queue q = new queue();  
        q.add(1);  
        q.add(2);  
        q.add(3);  

        while (!q.isEmpty()) {  
            System.out.println(q.peek());  
            q.remove();  
        }  
    }  
}   