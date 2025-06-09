package easy;

import java.util.*;

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
    //Anther Solution
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

    public static class BinarySearch {
        public int search(int[] nums, int target) {
            int l=0,r=nums.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                    if(nums[mid]>target){
                        r=mid-1;
                    }
                    else if(nums[mid]<target){
                        l=mid+1;
                    }
                    else return mid;
                }
            return -1;
        }
        public static void main(String[] args) {
            BinarySearch bs = new BinarySearch();
            int[] nums = {1,2,3,4,5,6,7,8,9};
            System.out.println(bs.search(nums, 9));
        }

    }

    public static class DuplicateIntgers {
        public boolean hasDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            return set.size() != nums.length;
        }
    }

    public static class IsAnagram {
        public boolean isAnagram(String s, String t) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            char[] charArray2 = t.toCharArray();
            Arrays.sort(charArray2);
            return Arrays.equals(charArray, charArray2);
        }
        public static void main(String[] args) {
            IsAnagram isAnagram = new IsAnagram();
            System.out.println(isAnagram.isAnagram("anagram", "nagaram"));
        }
    }

    public static class TwoIntSum {
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
}
