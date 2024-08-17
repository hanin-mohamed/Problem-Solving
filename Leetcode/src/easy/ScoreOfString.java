package easy;

import static java.lang.Math.abs;

public class ScoreOfString {
    public int scoreOfString(String s) {
        if (s.length() == 0) return s.charAt(0);
        int score = 0;
        for (int i = 0; i < s.length()-1; i++) {
            score +=  abs(s.charAt(i)-s.charAt(i+1));
        }
        return score;
    }

    public static void main(String[] args) {
        ScoreOfString scoreOfString = new ScoreOfString();
        System.out.println(scoreOfString.scoreOfString("h"));
    }
}
