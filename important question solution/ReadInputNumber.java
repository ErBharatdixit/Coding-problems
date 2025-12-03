import java.util.*;

public class ReadInputNumber {
      public static void main(String[] args) {
            int n;
            System.out.println("Enter thr integer: ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();

            System.out.println("Entered integer is: " + n);
            s.close();// important to prevent resource leaks

      }

}
