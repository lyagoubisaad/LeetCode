package leetcode_categories.math_geometry;

import java.util.HashMap;
public class L_149_MaxPointsonaLine {
    public static int maxPoints(int[][] points) {
        HashMap<Double, Integer> slotOccur = new HashMap<>();
        int max = 0;
        for (int i=0;i<points.length;i++) {
            slotOccur.clear();
            int duplicate = 0;
            int sameY=0;
            for (int j=0;j<points.length;j++) {
                if(j==i) continue;
                if((points[i][1]!=points[j][1])) {
                    if(points[i][1]==points[j][1] && points[i][0]==points[j][0]) {
                        duplicate++;
                        continue;
                    }
                    double slot = (double) ((points[i][1]-points[j][1]))/(double) (points[i][0]-points[j][0]);
                    slotOccur.put(slot, slotOccur.getOrDefault(slot, 0)+1);
                    max = Math.max(max, slotOccur.get(slot)+1+duplicate);
                } else {
                    sameY++;
                }
            }
            max = Math.max(max, sameY);
        }
        return max;
    }
}
