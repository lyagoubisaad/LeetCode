package LeetCodeCategories.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L_1029_TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        int cityA = 0;
        int cityB = 0;
        int sum = 0;
        Arrays.sort(costs, Comparator.comparingInt(arr -> Math.abs(arr[0]-arr[1])));
        for (int i=costs.length-1;i>=0;i--) {
            if(cityA == costs.length/2) {
                sum += costs[i][1];
            } else if(cityB == costs.length/2) {
                sum += costs[i][0];
            } else {
                if(costs[i][0] < costs[i][1]) {
                    cityA++;
                    sum += costs[i][0];
                } else {
                    cityB++;
                    sum += costs[i][1];
                }
            }
        }
        return sum;
    }
}
