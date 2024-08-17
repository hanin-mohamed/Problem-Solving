package easy;
import java.util.*;
import java.io.*;
import java.lang.*;
public class TwoSum {
  //Iterative sol
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int x=nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (x + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

     //HashMap
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
     TwoSum ts = new TwoSum();
     int [] a=ts.twoSum2(new int[]{2, 7, 11, 15}, 9);
     System.out.println(Arrays.toString(a));
    }
}