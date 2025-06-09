package easy;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        String add="maa";
       for (String word:sentence.split(" ")) {
           if (word != null&&!word.isEmpty() && "AEIOUaeiou".contains(String.valueOf(word.charAt(0)))) {
               word=word+add;
           }
           else {
               word=word.substring(1)+word.charAt(0)+add;
           }
           add+='a';
           res.append(word).append(" ");
       }
       return res.toString();
    }
    public static void main(String[] args) {
        GoatLatin goatLatin = new GoatLatin();
        System.out.println(goatLatin.toGoatLatin("T  Fffd IASVF "));
    }
}
