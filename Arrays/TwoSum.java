import java.util.*;
class TwoSum{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         
         int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        int target = sc.nextInt();

        int left = 0 , right = n-1;
        int sum = 0;
        while(left < right){

            sum = arr[left] + arr[right];

            if( sum == target){
                System.out.println("found "+sum+" = "+target);
                return;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }

        }
    }
}