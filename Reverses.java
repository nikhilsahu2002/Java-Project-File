public class Reverses {
    public boolean isPalindrome(String a) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        a = a.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = a.length() - 1;

        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Reverses rev = new Reverses();
        boolean result = rev.isPalindrome("phpe");
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
