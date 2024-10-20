package meduim;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;

        while (l<r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{l+1,r+1};
    }
    public static void main(String[] args) {
        TwoSumII t = new TwoSumII();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = t.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
