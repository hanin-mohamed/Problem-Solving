package meduim;

public class Special_Array {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            n[i]+=n[i-1];
            if (nums[i]%2==nums[i-1]%2 )
                n[i]++;
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            System.out.println(n[queries[i][0]]+"  "+n[queries[i][1]]);
           if (n[queries[i][0]]==n[queries[i][1]])
            ans[i] = true;
           else ans[i]=false;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
