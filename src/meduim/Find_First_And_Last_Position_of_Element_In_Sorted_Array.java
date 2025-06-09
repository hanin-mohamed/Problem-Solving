package meduim;

public class Find_First_And_Last_Position_of_Element_In_Sorted_Array {


    // Bad Practice
    public int[] searchRange(int[] nums, int target) {

        int x = -1, y = -1;
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) return new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                x = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                y = i;
                break;
            }
        }
        System.out.println(x+" " + y);
        return new int[]{x, y};
    }

    // Better Practice (Binary-Search)
    public int[] searchRange2(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) return new int[]{-1, -1};
        int l=0,r=nums.length-1,start=-1,end=-1;
        while (l<=r) {
        int mid=(l+r)/2;
        if (nums[mid]>=target) r=mid-1;
        else l=mid+1;
        }
        if (nums[l]==target)
        start=l;
        l=0;r=nums.length-1;
        while (l<=r) {
        int mid=(l+r)/2;
        if (nums[mid]<=target) l=mid+1;
        else r=mid-1;
        }
        if (nums[r]==target)
        end=r;
        //System.out.println(start+" "+end);
        return new int[]{start,end};

    }

    public static void main(String[] args) {
        Find_First_And_Last_Position_of_Element_In_Sorted_Array f = new Find_First_And_Last_Position_of_Element_In_Sorted_Array();
        f.searchRange2(new int[]{5, 7, 7, 8, 8, 10}, 8);

    }
}