package easy;

public class ValidWord {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        if (!word.matches("[a-zA-Z0-9]+")) return false;
        if (!word.matches(".*[AEOUIaeoiu].*")) return false;
        String vowels = "AEOUIaeoiu";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid2(String word) {
        if (word.length() < 3) return false;
        boolean isVowel = false, isCon = false;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||
                    (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                if (word.charAt(i) == 'a' ||
                        word.charAt(i) == 'o' ||
                        word.charAt(i) == 'u' ||
                        word.charAt(i) == 'i' ||
                        word.charAt(i) == 'e' ||
                        word.charAt(i) == 'A' ||
                        word.charAt(i) == 'O' ||
                        word.charAt(i) == 'U' ||
                        word.charAt(i) == 'I' ||
                        word.charAt(i) == 'E') {
                    isVowel = true;
                } else {
                    isCon = true;
                }
            }
             else if(!(word.charAt(i)>='0')||!(word.charAt(i)<='9'))
                return false;
        }
       if (isCon&&isVowel)return true;
       return false;
    }
        public static void main(String[] args) {
        ValidWord vw = new ValidWord();
        System.out.println(vw.isValid2("Ya$"));
    }
}
