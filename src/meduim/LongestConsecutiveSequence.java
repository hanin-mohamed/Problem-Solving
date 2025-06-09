package meduim;


import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        Arrays.sort(nums);
        int mx=1,ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                mx++;
                ans = Math.max(ans,mx);
            }
            else if (nums[i+1]-nums[i]>1)mx=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        System.out.println(l.longestConsecutive(new int[]{1,2,8,7,9,9,9,3}));
    }
}
