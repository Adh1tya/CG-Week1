public class PalindromeChecker {
    private String text;

    
    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedText.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println( text + " is a palindrome.");
        } else {
            System.out.println( text + " is not a palindrome.");
        }
    }

   
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("malayalam");
        checker.displayResult();
    }
}
