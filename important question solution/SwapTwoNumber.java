public class SwapTwoNumber {
      static void swapValuesUsingThirdVariable(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Using thirdVariable :"+" Value of a is " + a + " and Value of b is " + b);
      }

      static void swapValuesWithoutUsingThirdVariable(int[] values) {
            values[0] = values[0] - values[1];
            values[1] = values[0] + values[1];
            values[0] = values[1] - values[0];

      }

      static void swapValuesUsingXOROperator(int a, int b) {
            int n = a ^ b;
            a = n ^ a;
            b = n ^ b;
            System.out.println("Using XOR :"+" Value of a is " + a + " and Value of b is " + b);

      }

      public static void main(String[] args) {
            // we have three approaches to swap numbers varying from space and time
            // complexity

            
            int a = 6;
            int b = 5;
            int values[] = { 6, 5 };

            swapValuesUsingThirdVariable(a, b);
            swapValuesWithoutUsingThirdVariable(values);
            System.out.println( "Using withoutThird variable :"+" values of a is " + values[0] + " and value of b is " + values[1]);
           swapValuesUsingXOROperator(a, b);
      }

}
