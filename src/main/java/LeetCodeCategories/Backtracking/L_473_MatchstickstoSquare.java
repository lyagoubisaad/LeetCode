package LeetCodeCategories.Backtracking;

import java.util.*;

public class L_473_MatchstickstoSquare {
    public static boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) return false;
        int sum = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
        }
        if (sum%4 != 0) return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return dfs(new int[4], matchsticks, sum/4, 0);
    }
    private static boolean dfs(int[]sides, int[] matchsticks, int avg, int idx) {
        if(idx == matchsticks.length) {
            for (int side : sides) {
                if (side != avg) return false;
            }
            return true;
        }
        for (int i=0;i<sides.length;i++) {
            if(sides[i] + matchsticks[idx] > avg) continue;
            sides[i] += matchsticks[idx];
            if(dfs(sides, matchsticks, avg, idx+1)) return true;
            sides[i] -= matchsticks[idx];
        }
        return false;
    }
    private static void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}
