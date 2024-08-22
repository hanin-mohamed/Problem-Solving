package easy;

public class NumOfChangingKeys {
    public int countKeyChanges(String s) {
        int cnt = 0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) !=s.charAt(i+1)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        NumOfChangingKeys cntDif = new NumOfChangingKeys();
        System.out.println(cntDif.countKeyChanges("aAbBcC"));
    }
}
