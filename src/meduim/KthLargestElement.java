package meduim;


import java.util.*;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];

    }
    public static void main(String[] args) {
        KthLargestElement k = new KthLargestElement();
        System.out.println(k.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 2));
    }
}
