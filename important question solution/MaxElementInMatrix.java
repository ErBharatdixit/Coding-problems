public class MaxElementInMatrix {
      public static int findMaxElement(int[][] matrix) {
            // Assume the first element is the maximum
            int max =    Integer.MAX_VALUE;//matrix[0][0];

            // Loop through each row
            for (int i = 0; i < matrix.length; i++) {
                  // Loop through each column in the current row
                  for (int j = 0; j < matrix[i].length; j++) {
                        // Update max if we find a larger element
                        if (matrix[i][j] > max) {
                              max = matrix[i][j];
                        }
                  }
            }
            return max;
      }

      public static void main(String[] args) {
            int[][] matrix = {
                        { 3, 5, 1 },
                        { 2, 8, 6 },
                        { 4, 7, 9 }
            };

            int maxElement = findMaxElement(matrix);
            System.out.println("The maximum element in the matrix is: " + maxElement);
      }

      
}