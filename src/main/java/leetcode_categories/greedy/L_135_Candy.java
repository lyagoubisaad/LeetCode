package leetcode_categories.greedy;

import java.util.Arrays;

public class L_135_Candy {
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for (int i=1;i<ratings.length;i++) {
            if(ratings[i] < ratings[i-1]) {
                candies[i-1] = Math.max(candies[i]+1, candies[i-1]);
            }
            else if(ratings[i] > ratings[i-1]) {
                candies[i] = Math.max(candies[i-1]+1, candies[i]);
            }

        }
        for (int i=ratings.length-1;i>0;i--) {
            if(ratings[i] < ratings[i-1]) {
                candies[i-1] = Math.max(candies[i]+1, candies[i-1]);
            }
            else if(ratings[i] > ratings[i-1]) {
                candies[i] = Math.max(candies[i-1]+1, candies[i]);
            }

        }
        int sum = 0;
        for (int candy: candies) {
            sum += candy;
        }
        return sum;
    }
}
