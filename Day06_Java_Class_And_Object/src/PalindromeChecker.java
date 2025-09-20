class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam");
        checker.displayResult();
    }
}



