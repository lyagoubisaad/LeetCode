package leetcode_categories.dynamic_programming_2d;

import java.util.ArrayList;
import java.util.List;

public class L1866NumberWaysRearrangeSticksWithKSticksVisible {
    public int rearrangeSticks(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, new ArrayList<>(), new boolean[n + 1], result);
        int sum = 0;
        for (int i=0;i<result.size();i++) {
            int cpt = k-1;
            int j=1;
            int max = result.get(i).get(0);
            while (j<result.get(i).size()) {
                if(cpt == 0) break;
                if(result.get(i).get(j) > max) {
                    cpt--;
                    max = result.get(i).get(j);
                }
                j++;
            }
            if(j == result.get(i).size() && k == 0) sum++;
        }
        return sum;
    }

    //2,1,3

    private static void backtrack(int n, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                current.add(i);
                used[i] = true;
                backtrack(n, current, used, result);
                used[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }

}
