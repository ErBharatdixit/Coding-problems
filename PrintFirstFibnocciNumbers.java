import java.util.*;

class PrintFirstFibnocciNumbers {

      public static int[] firstFibb(int n) {

            int res[] = new int[n];

            if (n == 0)
                  res[0] = 0;

            if (n > 1)
                  res[1] = 1;

            for (int i = 2; i < n; i++) {
                  res[i] = res[i - 1] + res[i - 2];
            }
            return res;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(Arrays.toString(firstFibb(n)));

      }

}
