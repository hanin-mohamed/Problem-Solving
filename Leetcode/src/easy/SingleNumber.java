package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i+=2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
        public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{44,7,4,2,2,3,3,4}));
    }

}
