public class CharacterCheck {
    public static void main(String[] args) {
        // Initialize a character variable
        char ch = '#';  // You can change this value to test different characters

        // Check and print the type of character
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
