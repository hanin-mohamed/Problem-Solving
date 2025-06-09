package easy;

public class NumOfStringSeg {
    public int countSegments(String s) {
        if (s==null || s.trim().isEmpty()) return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;

    }

    public static void main(String[] args) {
        NumOfStringSeg numOfStringSeg = new NumOfStringSeg();
        System.out.println(numOfStringSeg.countSegments("abba"));
    }
}
