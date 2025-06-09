package easy;

public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n-1,r1=m-1,r2=n-1;
        while (r1>=0 && r2>=0) {
            if (nums1[r1]>nums2[r2]){
                nums1[l--]=nums1[r1--];
            }else {
                nums1[l--]=nums2[r2--];
            }
        }
        while (r2>=0){
            nums1[l--]=nums2[r2--];
        }
    }
    public static void main(String[] args) {
        Merge_Sorted_Array m = new Merge_Sorted_Array();
        m.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
