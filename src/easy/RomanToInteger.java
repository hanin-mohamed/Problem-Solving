package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    //
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        if (s.length() < 2) {
            return mp.get(s.charAt(0));
        } else {
            int idx = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int val1 = mp.get(s.charAt(i));
                int val2 = mp.get(s.charAt(i + 1));
                if (val1 < val2) {
                    sum += (val2 - val1);
                    i++;
                } else sum += val1;
                idx = i;
            }
            if (idx < s.length() - 1)
                return sum + mp.get(s.charAt(idx + 1));
            else return sum;
        }
    }


    public int romanToInt2(String s) {

        int sum = 0, val = 0, preVal = 0;
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        for (int i = 0; i < s.length() ; i++) {
            val = mp.get(s.charAt(i));
            if (val > preVal) sum += (val - 2 * preVal);
            else sum += val;
            preVal = val;
        }
        return sum;
    }


    public static void main(String[] args) {
        RomanToInteger r=new RomanToInteger();
        System.out.println(r.romanToInt2("III"));

    }
}
