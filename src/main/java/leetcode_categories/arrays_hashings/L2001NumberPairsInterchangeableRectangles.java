package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L2001NumberPairsInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> store = new HashMap<>();
        int sum = 0;
        double ratio;
        for (int i=rectangles.length-1;i>=0;i--) {
            ratio = (double) rectangles[i][0]/rectangles[i][1];
            if(store.containsKey(ratio)) sum += store.get(ratio);
            store.put(ratio, store.getOrDefault(ratio, 0L)+1);
        }
        return sum;
    }
}
