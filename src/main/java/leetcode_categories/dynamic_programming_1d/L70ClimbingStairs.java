package leetcode_categories.dynamic_programming_1d;

import java.util.HashMap;

public class L70ClimbingStairs {

    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return dfs(n, map);
    }

    private int dfs(int n, HashMap<Integer, Integer> map) {
        if(!map.containsKey(n)) {
            if(n==0) return 1;
            if(n < 0) return 0;
            map.put(n, dfs(n-1, map) + dfs(n-2, map));
        }
        return map.get(n);
    }
}
