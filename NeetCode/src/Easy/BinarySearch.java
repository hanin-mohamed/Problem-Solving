package Easy;

public class BinarySearch {
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
