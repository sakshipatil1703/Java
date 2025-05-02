import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_vowels_words {
    public static void main(String[] args) {
        String filePath = "../sample.txt"; 

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
  
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                for (char ch : line.toCharArray()) {
                    if (isVowel(ch)) {
                        vowelCount++;
                    }
                    if (ch == 'a' || ch == 'A') {
                        aCount++;
                    }
                }
            }

            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
