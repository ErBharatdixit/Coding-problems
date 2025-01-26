class SearchInSortedMatrix{
public static boolean staircaseSearch(int matrix[][], int key){
     int row = 0,col = matrix[0].length-1;

     while(row < matrix.length && col >=0){
          if(key == matrix[row][col]){
               System.out.println("found key at"+"("+row +" "+col+")");
               return true;
          }
          else if
               (key < matrix[row][col]){
                    col--;
               }else{
                    row ++;
               }
          

     }
     System.out.println("key is not found");
     return false;
}



       public static void main(String [] args){
            int arr [][] = {{10, 20, 30, 40},{15, 25, 35,45},{27,29, 37, 48},{32,33,39,50}};
            int key = 100;
            staircaseSearch(arr,key);
}
}
