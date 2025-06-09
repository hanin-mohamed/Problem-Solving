package easy;
public class ValidPalindrom {
    public static boolean isPalindrome(String s) {
        StringBuilder chars = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                chars.append(Character.toLowerCase(c));}}
        String s1 = chars.toString();
        String s2 = chars.reverse().toString();

        return s1.equals(s2);
    }

    public static boolean isPalindrome2(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }
}
