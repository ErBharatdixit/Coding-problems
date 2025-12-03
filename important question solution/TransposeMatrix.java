class TransposeMatrix{
      public static void Transpose(int matrix[][]){
            int row = matrix.length;
            int col = matrix[0].length;

            int transpose[][] = new int[col][row];

            for(int i = 0; i<row; i++){
                  for(int j = 0; j<col; j++){
                        transpose[j][i] = matrix[i][j];
                  }
            }

            for(int i = 0; i<transpose.length; i++){
                  for(int j = 0; j<transpose[0].length; j++){
                        System.out.println(transpose[i][j]);
                  }
                  System.out.println();
            }

      }

      public static void main(String args []){
            int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

            Transpose(matrix);
      }
}