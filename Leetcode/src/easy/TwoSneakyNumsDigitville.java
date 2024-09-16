package easy;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class TwoSneakyNumsDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int cnt=0;
        int[] sneaky = new int[2];
        for (Map.Entry<Integer,Integer>entry:map.entrySet()) {
            if (entry.getValue() == 2) {
                sneaky[cnt] = entry.getKey();
                cnt++;
            }
        }
        return sneaky;
    }

     public static void main(String[] args) {
        TwoSneakyNumsDigitville twoSneakyNumsDigitville=new TwoSneakyNumsDigitville();
         System.out.println(twoSneakyNumsDigitville.getSneakyNumbers(new int[]{1,3,2,2,1,4,0,}));


    }
}
