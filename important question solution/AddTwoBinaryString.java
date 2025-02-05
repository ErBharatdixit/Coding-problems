public class AddTwoBinaryString {
      static String  Add_TwoBinary(String s1,String s2)
      {
    int num1 = Integer.parseInt(s1,2);
    int num2 = Integer.parseInt(s2,2);

    int sum = num1+num2;
      String result = Integer.toBinaryString(sum);
      return result;

      }

      public static void main(String[] args) {
            String s1 = "10001";
            String s2 = "01110";
           System.out.println(Add_TwoBinary(s1, s2)); 
      }

      
}
