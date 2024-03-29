package leetcode_categories.arrays_hashings;

import java.util.HashMap;
import java.util.Map;

public class L_2001_NumberOfPairsOfInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        double[] ratio = new double[rectangles.length];
        HashMap<Double, Integer> store = new HashMap<>();
        for (int i=0;i<rectangles.length;i++) {
            ratio[i] = (double) rectangles[i][0]/rectangles[i][1];
            store.put(ratio[i], store.getOrDefault(ratio[i], 0) + 1);
        }
        long cpt = 0;
        for (Map.Entry<Double, Integer> entry : store.entrySet()) {
            cpt += calc(entry.getValue());
        }
        return cpt;
    }

    private long calc(int value) {
        long calc = 0;
        for (int i=value-1;i>0;i--) {
            calc += i;
        }
        return calc;
    }

    public static void main(String[] args) {
        new L_2001_NumberOfPairsOfInterchangeableRectangles().interchangeableRectangles(new int[][] {{4,5}, {7,8}});
    }
}
