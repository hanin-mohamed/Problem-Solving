package meduim;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Distribute_Candies_Among_Children {

    public long distributeCandies(int n, int limit) {
        long ans=0;
        for (int i = 0; i <= min(n,limit); i++) {
            if (n-i<=2*limit) ans+= min(n-i, limit)-max(0, n-i-limit)+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Distribute_Candies_Among_Children distributeCandies = new Distribute_Candies_Among_Children();
        System.out.println(distributeCandies.distributeCandies(3, 2));
        System.out.println(distributeCandies.distributeCandies(3, 3));
    }
}
