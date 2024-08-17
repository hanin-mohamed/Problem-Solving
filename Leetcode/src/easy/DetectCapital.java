package easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1)return true;
        int cap=0,small=0;
        boolean isCap=(word.charAt(0)>='A'&&word.charAt(0)<='Z');
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)>='a'&&word.charAt(i)<='z')small++;
            else cap++;
        }
        if (small==word.length() ||cap==word.length()||
                (small==word.length()-1&&isCap))return true;
         return false;
    }

    public static void main(String args[]){
        DetectCapital detectCapital = new DetectCapital();
        System.out.println(detectCapital.detectCapitalUse("Uyjjtioh"));
    }
}
