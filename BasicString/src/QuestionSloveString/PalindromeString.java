package QuestionSloveString;

public class PalindromeString {

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}