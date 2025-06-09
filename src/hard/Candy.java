package hard;


import java.util.Arrays;

import static java.lang.Math.max;

/*
 https://leetcode.com/problems/candy/?envType=daily-question&envId=2025-06-09
* */
public class Candy {
    public int candy(int[] ratings) {
        int candies[] = new int[ratings.length];
        int tot = 0;
        for (int i = 0; i < candies.length; i++) {
            candies[i] = 1;
        }
        for (int i = 0; i < ratings.length-1; i++) {
         if (ratings[i] < ratings[i + 1]) {
                candies[i + 1] = candies[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1]) {
                candies[i] = max(candies[i - 1], candies[i] + 1);
            }

        }
        for (int i = 0; i < candies.length; i++) {
            tot+=candies[i];
        }
        return tot;
    }
    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] ratings = {1, 0, 2};
        System.out.println(candy.candy(ratings));
    }
}
