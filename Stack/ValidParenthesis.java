import java.util.*;

class ValidParenthesis{
      public static boolean isValid(String parenthesis){
            Stack<Character> s = new Stack<>();
            for(int i = 0; i<parenthesis.length(); i++){
                  char ch = parenthesis.charAt(i);

                  if(ch == '(' || ch == '{' || ch == '['){
                       s.push(ch);
                  }else{
                        if(s.isEmpty()){
                              return false;
                        }
                        if( (s.peek() == '(' && ch == ')')|| (s.peek() == '{' && ch == '}')|| (s.peek() == '[' && ch == ']')){
                              return true;
                        }else{
                              return false;
                        }
                  }

            }
            if(s.isEmpty()){
                  return true;
            }else{
                  return false;
            }
      }
      public static boolean isDuplicate(String str){
            Stack<Character> s = new Stack<>();
            for(int i = 0; i<str.length(); i++){
                  char ch = str.charAt(i);
                  //closing
                  if(ch == ')'){
                        int count = 0;
                        while( s.peek() != '('){
                              s.pop();
                              count++;
                        }
                        if(count <1){
                              return true;
                        }else{
                              s.pop();
                        }
                  }else{
                  // opening, operator, operands
              s.push(ch);

                  }

            }
            return false;
      }
      public static void main(String [] args){
            //String parenthesis = "([{]}])";
            String str = "(a+b)";
            System.out.println(isDuplicate(str));
      }
}