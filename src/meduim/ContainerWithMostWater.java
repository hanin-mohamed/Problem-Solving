package meduim;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int mx=0;
        while (l<r){
            mx=max(mx,min(height[l],height[r])*(r-l));
            if(height[l]<height[r])l++;
            else r--;
        }
        return mx;
    }
    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        System.out.println(c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
