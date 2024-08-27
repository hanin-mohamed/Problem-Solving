package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumOfPushs {
    public int minimumPushes(String word) {
        if (word.length()<=8)return word.length();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        int cnt=1,sum=0,x=0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            sum+=entry.getValue()*cnt;
            x++;
            cnt=(x/8)+1;
            System.out.println("cnt "+cnt );
            System.out.println("sum "+sum);

        }
        return sum;
    }
    public static void main(String[] args) {
        NumOfPushs numOfPushs = new NumOfPushs();
        System.out.println(numOfPushs.minimumPushes("xycdefghij"));
    }
}
