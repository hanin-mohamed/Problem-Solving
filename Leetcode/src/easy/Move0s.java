package easy;

import java.util.Stack;

public class Move0s {
    public void moveZeroes(int[] nums) {
        int x=0;
        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i] != 0) {
                nums[x] = nums[i];
                x++;
            }
        }
           for (int i = x; i < nums.length ; i++) {
               nums[i] = 0;
           }
    }
    //Anthor Solution
    public void move0s(int[]nums){
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i] != 0) {
                stack.push(nums[i]);
            }
        }
        int x=stack.size();
        for (int i = 0; !stack.isEmpty(); i++) {
            nums[i] = stack.pop();
        }
        if (x>0) {
            for (int i = x; i < nums.length ; i++) {
                nums[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Move0s m = new Move0s();
       m.moveZeroes(new int[]{0,1,0,3,12});

    }
}
