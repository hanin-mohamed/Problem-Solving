package Easy;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        return Arrays.equals(charArray, charArray2);
    }
    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("anagram", "nagaram"));
    }
}
