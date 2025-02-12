import java.util.*;

class NextGreaterElement{
 public static void nextGreaterElement(int arr[],int NextGreater[]){
      Stack<Integer> s = new Stack<>();
       for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                  s.pop();
            }
            if(s.isEmpty()){
                  NextGreater[i] = -1;
            }else{
                  NextGreater[i] = arr[s.peek()];
            }
            s.push(i);
       }
 }



      public static void main(String[] args){
    int arr [] = {6,8,0,1,3};
    int NextGreater []  = new int [arr.length] ;
    nextGreaterElement(arr,NextGreater);  
    
    for(int i = 0; i<NextGreater.length; i++){
         System.out.println(NextGreater[i]+" ");
    }
     System.out.println();
            




      }
}