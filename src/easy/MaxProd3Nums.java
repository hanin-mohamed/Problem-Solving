package easy;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaxProd3Nums {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0||nums[nums.length-1]<0)
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int s= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int x=nums[0],y=nums[1],z=nums[2];
        int b=x*y*nums[nums.length-1];
        int a=x*y*nums[nums.length-3];

      return max(max(max(a,s),x*y*z),b);
    }
    public static void main(String[] args) {
        MaxProd3Nums m = new MaxProd3Nums();
        System.out.println(m.maximumProduct(new int[]{-100,-98,-1,-2}));
    }

}
