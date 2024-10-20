package meduim;

import java.util.*;

public class SortVowelinString {
    public String sortVowels(String s) {
        List<Character> t = new ArrayList<>();
        StringBuilder ans =new StringBuilder(s);
        for (char c:s.toCharArray()) {
            char x =Character.toLowerCase(c);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                t.add(c);
            }
        }
        if (t.isEmpty()) return s;
        Collections.sort(t);
        int j=0;
        for (int i = 0; i < ans.length(); i++) {
            char x  =Character.toLowerCase(ans.charAt(i));
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                ans.setCharAt(i,t.get(j));
                j++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        SortVowelinString s = new SortVowelinString();
        String t = "lEetcOde";
        System.out.println(s.sortVowels(t));
    }
}
