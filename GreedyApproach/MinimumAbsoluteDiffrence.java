import java.util.*;
class MinimumAbsoluteDiffrence{
      public static void main(String[]args){
            int a [] = {4,1,8,7};
            int b [] = {2,3,6,5};
            Arrays.sort(a);
            Arrays.sort(b);
            int MinValue = 0;
            for(int i = 0; i<a.length; i++){
                  MinValue += Math.abs(a[i] - b[i]);

            }
            System.out.println("the minimum absolute value is: "+ MinValue);

      }
}