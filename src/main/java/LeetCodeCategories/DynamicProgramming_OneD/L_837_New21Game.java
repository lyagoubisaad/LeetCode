package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_837_New21Game {
    public double new21Game(int n, int k, int maxPts) {
        Queue<Integer> aboveEqualK = new ArrayDeque<>();
        Queue<Integer> belowK = new ArrayDeque<>();
        for (int i=1;i<=maxPts;i++) {
            if(i>= k) aboveEqualK.add(i);
            else belowK.add(i);
        }
        while (!belowK.isEmpty()) {
            helper(aboveEqualK, belowK, maxPts, k);
        }
        int sum = 0;
        for (int elem: aboveEqualK) {
            if(elem <= n) sum++;
        }
        return (double) sum/(aboveEqualK.size()+belowK.size());
    }

    private void helper(Queue<Integer> aboveEqualK, Queue<Integer> belowK, int maxPts, int k) {
        int size = belowK.size();
        for (int i=0;i<size;i++) {
            int elem = belowK.poll();
            for (int j=1;j<=maxPts;j++) {
                if(j+elem>= k) aboveEqualK.add(j+elem);
                else belowK.add(j+elem);
            }
        }
    }
}
