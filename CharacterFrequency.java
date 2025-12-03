import java.util.Scanner;

public class CharacterFrequency {

      public static void printCharacterFrequency(String str) {
            int[] freq = new int[26]; // Assuming only lowercase a-z

            for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
                  freq[ch - 'a']++;
            }

            System.out.println("Character frequencies:");
            for (int i = 0; i < 26; i++) {
                  if (freq[i] > 0) {
                        System.out.print(""+(char) (i + 'a')+freq[i]);
                  }
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            printCharacterFrequency(str);

      }
      
}
