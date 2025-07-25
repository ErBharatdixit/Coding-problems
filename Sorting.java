

public class Sorting {
      public static void bubbleSort(int arr[]){
            int count = 0;

            for(int turn = 0; turn < arr.length-1; turn++){
                  for(int j = 0; j<arr.length-1-turn; j++){
                        if(arr[j]>arr[j+1]){
                              int temp = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = temp;
                              count ++;
                        }
                        if(count == 0){
                              break;
                        }
                  }
            }
            System.out.println(count);

      }

      public static void SelectionSort(int arr[]){
            for(int i = 0; i<arr.length-1; i++){
                  int min = i;
                  for(int j = i+1; j<arr.length; j++){
                        if(arr[min]>arr[j]){
                              min = j;
                        }

                  }

                  int temp = arr[min];
                  arr[min] = arr[i];
                  arr[i] = temp;
            }
      }
      public static void printArray(int arr[]){
            for(int i = 0; i<arr.length; i++){
                  System.out.print(arr[i]+" ");
            }
      }
      public static void main(String[] args) {
            int [] arr = {1,2,6,4,9,6,7};
            //bubbleSort(arr);
            SelectionSort(arr);
            printArray(arr);
      }
      
}
