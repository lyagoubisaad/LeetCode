package leetcode_categories.graphs;

import java.util.HashMap;

public class L_1553_MinimumNumberDaysEatNOranges {
    HashMap<Integer, Integer> memo = new HashMap<>();
    public int minDays(int n) {
        if (n == 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);
        memo.put(n, Math.min(1 + n % 3 + minDays(n / 3), 1 + n % 2 + minDays(n / 2)));
        return memo.get(n);
    }
}
