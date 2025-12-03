import java.util.*;

class FirstCharacterNotInString{
      public static void main(String[] args) {
            

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

            int arr[] = new int[26];

            for(char ch : str.toCharArray()){
                  arr[ch-'a']++;
            }

            for(int i = 0; i<arr.length; i++){
                  if(arr[i] == 0){
                        System.out.println((char)('a' + i));
                        break;
                  }
            }
      }
}