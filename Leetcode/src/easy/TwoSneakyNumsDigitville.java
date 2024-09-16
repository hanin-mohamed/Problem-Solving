package easy;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSneakyNumsDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int cnt = 0;
        int[] sneaky = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                sneaky[cnt] = nums[i];
                cnt++;
            }
        }
        return sneaky;
    }
    //Anthor Solution
    public int[] getSneakyNumbers2(int[] nums) {
        int cnt = 0;
        int[] sneaky = new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                sneaky[cnt]= nums[i];
                cnt++;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return sneaky;
    }

     public static void main(String[] args) {
        TwoSneakyNumsDigitville twoSneakyNumsDigitville=new TwoSneakyNumsDigitville();
         System.out.println(twoSneakyNumsDigitville.getSneakyNumbers(new int[]{1,3,2,2,1,4,0,}));


    }
}
