package leetcode_categories.dynamic_programming_2d;

import java.util.Arrays;

public class L1547MinimumCostCutStick {

    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        return dfs(cuts, 0, n);
    }
    private int dfs(int[] cuts, int left, int right) {
        if (right - left == 1) return 0;
        int totalSum = Integer.MAX_VALUE;
        for (int cut: cuts) {
            if(left < cut && cut < right) {
                int localSum = dfs(cuts, left, cut) + dfs(cuts, cut, right) + right - left;
                totalSum = Math.min(totalSum, localSum);
            }
        }
        if(totalSum == Integer.MAX_VALUE) totalSum = 0;
        return totalSum;
    }

}
