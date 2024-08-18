package easy;

import java.util.ArrayList;

public class ClimbingStairs {
    public int climbStairs(int n) {
        // 1 2 3 5 8 13 21 ...
        ArrayList<Integer> stairs = new ArrayList();
        stairs.add(1);
        stairs.add(2);
        stairs.add(3);
        for (int i = 2; i <= n; i++) {
            int x=stairs.get(i-1)+stairs.get(i);
          //  System.out.println("x "+x);
            stairs.add(x);
        }
        return stairs.get(n-1);
    }
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(4));
        System.out.println(cs.climbStairs(6));
        System.out.println(cs.climbStairs(7));
    }

}
