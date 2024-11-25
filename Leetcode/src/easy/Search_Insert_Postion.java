package easy;

public class Search_Insert_Postion {

    public int searchInsert(int[] nums, int target) {
        if (nums[nums.length-1]<target)
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Search_Insert_Postion obj = new Search_Insert_Postion();
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(obj.searchInsert(nums, target));
    }
}
