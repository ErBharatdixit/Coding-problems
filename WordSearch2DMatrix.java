import java.util.*;

class WordSearch2DMatrix {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int m = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int n = sc.nextInt();
            char[][] board = new char[m][n];
            System.out.println("Enter the characters in the matrix:");
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        board[i][j] = sc.next().charAt(0);
                  }
            }
            System.out.println("Enter the word to search:");
            String word = sc.next();
          
      }
}

    