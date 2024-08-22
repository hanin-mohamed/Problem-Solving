package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            Set<Character> str = new HashSet<>();
            for (char c : word.toCharArray()) {
                str.add(c);
            }
            if (isInOneRow(str, row1) || isInOneRow(str, row2) || isInOneRow(str, row3)) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private boolean isInOneRow(Set<Character> str, String row) {
        for (char c : str) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.findWords(new String[]{"Hello","Alaska","Dad","Peace"});
        keyboardRow.findWords(new String[]{"adsdf","sfd"});
    }
}
