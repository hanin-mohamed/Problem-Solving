package Easy;

import java.util.HashMap;

public class TwoIntSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)&&map.get(complement)!=i) {
                return new int[]{i,map.get(complement)};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoIntSum twoIntSum = new TwoIntSum();
        System.out.println(twoIntSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }




}
