import java.util.*;
import java.util.Map.Entry;
class RemoveSpecialCharacter {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();

        //String ans = str.replaceAll("[^a-zA-Z0-9]","");

        // remove white spaces

        //String ans = str.replaceAll("[^a-zA-Z0-9]", "");

        // remove Duplicate character
     // Using set Interface

     // sort in alphabetical order

//      char[] sort =  str.toCharArray();

//         Arrays.sort(sort);
   
//         String ans = "";
//         for(char ch : sort){
//             ans += ch;
//         }
//         System.out.println(



// StringBuilder sb = new StringBuilder();
// char ch = 'b';
// int count = 1;

// for (int i = 0; i < str.length(); i++) {
//       if (str.charAt(i) == ch) {
//             sb.append(count);
//             count++;
//       } else {
//             sb.append(str.charAt(i));
//       }
// }

// System.out.println(sb.toString());

// find first non repeating character

//     for(int i = 0; i<str.length(); i++){
//       boolean unique = true;

//       for(int j = 0; j<str.length(); j++){
//             if( i != j && str.charAt(i) == str.charAt(j)){
                  
//                   unique = false;
//                   break;

//             }
//       }
//       if(unique){
//             System.out.println(str.charAt(i));
//             break;
//       }
//     }

// Map<Character,Integer> mp = new HashMap<>();

// for(int i = 0; i<str.length(); i++){

//       char ch = str.charAt(i);

//       mp.put(ch,mp.getOrDefault(ch, 0)+1);
// }

// System.out.print(mp);

// for(Entry<Character, Integer> entrySet: mp.entrySet()){

      
//             System.out.print(entrySet.getKey()+ entrySet.getValue());
            


// }

// int arr[] = new int[26];



// for(char ch : str.toCharArray()){

//       arr[ch-'a']++;
// }

 
// for(int i = 0; i<arr.length; i++){
//       if(arr[i]>0){
//             System.out.println((char) (i+ 'a') +"" + arr[i]);
//       }
// }



// reverse a each word in sentence




// for(char ch : str.toCharArray()){
//       if(ch == ' '){
//          str =   str.replace(' ', '#');

// }








           
//       }
//       String ans = "";

// for(int i = str.length()-1; i>=0; i--){

//       ans += str.charAt(i);


// }
// for(char ch : ans.toCharArray()){
//       if(ch == '#'){
//             ans = ans.replace('#', ' ');
//       }
// }

// String [] ans2 = ans.split(" ");

// for(int i = ans2.length-1; i>=0; i--){

//       System.out.print(ans2[i]+" ");

// }

// longest Substring without repeating character

    Set<Character> st = new HashSet<>();
   int maxLength = 0;
   int left = 0;

   for(int right = 0; right<str.length(); right++){
        
      while(st.contains(str.charAt(right))){

            st.remove(str.charAt(left));

            left++;

      }

      st.add(str.charAt(right));

      maxLength = Math.max(maxLength, right-left+1);



   }
   System.out.println(maxLength);

   

    
}
      
}
