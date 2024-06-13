public class VowelsChecker {
    public static void main(String[] args) {
        String input = "Hllw , World";
        // convert input to lowercase
        input = input.toLowerCase();
        System.out.println(input);
        boolean hasVowels = checkForVowels(input);
        if (hasVowels) {
            System.out.println("the string has vowels");
        } else {
            System.out.println("string has not vowels");
        }
    }

    public static boolean checkForVowels(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is a vowel

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                return true; // Vowel found, return true

            }

        }

        return false; // No vowels found

    }

}
