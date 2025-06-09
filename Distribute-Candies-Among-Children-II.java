import static java.lang.Math.min;
import static java.lang.Math.max;
class Solution {
    public long distributeCandies(int n, int limit) {
        long ans=0;
        for (int i = 0; i <= min(n,limit); i++) {
            if (n-i<=2*limit) ans+= min(n-i, limit)-max(0, n-i-limit)+1;
        }
        return ans;
    }
}