import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Java program to demonstrate BufferedReader

public class Test {
      public static void main(String[] args) throws IOException {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           // for String
           String name = reader.readLine();
           System.out.println(name);

           // for int 
           String intInput = reader.readLine();

           int number = Integer.parseInt(intInput);
           System.out.println(number);

           // for float
           String floatInput = reader.readLine();
           float floatNumber = Float.parseFloat(floatInput);
           System.out.println(floatNumber);
      }
      
}
