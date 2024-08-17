package easy;
public class ValidPalindrom {

    public static boolean isPalindrome(String s) {
        StringBuilder chars = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                chars.append(Character.toLowerCase(c));
            }
        }
        String s1 = chars.toString();
        String s2 = chars.reverse().toString();

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
