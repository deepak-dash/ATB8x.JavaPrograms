package Sept.Task2509;

public class CountVowels {
    public static void main(String args[]) {
        String name = "Deepak";
        int vowel = 0;
        int consonant = 0;

        {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel = vowel + 1;
                } else {
                    consonant  = consonant  + 1;
                }
            }
            System.out.println("no of vowel:" + vowel);
            System.out.println("no of consents:" + consonant);

        }

    }
}
