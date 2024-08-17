package easy;

import java.util.Set;
import java.util.TreeSet;

public class RmvDuplicatesSortedArray {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[j]=nums[i];
                j++;
//                System.out.println(nums[j]+" "+j);
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
        return j;
    }
    public static void main(String[] args) {
        RmvDuplicatesSortedArray rmv = new RmvDuplicatesSortedArray();
        int[] nums = {0,1,2,2,3,0,4,2};
        rmv.removeElement(nums,2);
    }
}
