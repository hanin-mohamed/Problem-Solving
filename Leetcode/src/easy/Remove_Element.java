package easy;

public class Remove_Element {

    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Remove_Element obj = new Remove_Element();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(obj.removeElement(nums,2));
    }
}
