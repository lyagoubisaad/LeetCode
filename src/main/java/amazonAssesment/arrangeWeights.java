package amazonAssesment;

import java.util.List;

public class arrangeWeights {
    public int getMinNumMoves(List<Integer> blocks) {
        int minIdx = 0;
        int minVal = blocks.get(minIdx);
        int maxIdx = 0;
        int maxVal = blocks.get(maxIdx);
        for (int i=1;i<blocks.size();i++) {
            int block = blocks.get(i);
            if(block < minVal) {
                minVal = block;
                minIdx = i;
            }
            if(block > maxVal) {
                maxVal = block;
                maxIdx = i;
            }
        }
        int cost = minIdx+blocks.size()-1-maxIdx;
        if(maxIdx < minIdx) cost--;
        return cost;
    }

}
