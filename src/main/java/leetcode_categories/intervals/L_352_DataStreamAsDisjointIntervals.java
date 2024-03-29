package leetcode_categories.intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L_352_DataStreamAsDisjointIntervals {
    List<Integer> list;
    public L_352_DataStreamAsDisjointIntervals() {
        list = new ArrayList<>();
    }

    public void addNum(int value) {
        if(!list.contains(value)) list.add(value);
    }

    public int[][] getIntervals() {
        Collections.sort(list);
        List<List<Integer>> allists = new ArrayList<>();
        int start = 0;
        int end;
        while (start < list.size()) {
            end = start;
            while (end < list.size() && Math.abs(list.get(end)-list.get(start)) == Math.abs(end-start)) {
                end++;
            }
            end--;
            List<Integer> tmp = new ArrayList<>();
            tmp.add(list.get(start));
            tmp.add(list.get(end));
            allists.add(new ArrayList<>(tmp));
            start = end;
            start++;
        }
        int[][] res = new int[allists.size()][2];
        for (int i=0;i<allists.size();i++) {
            res[i][0] = allists.get(i).get(0);
            res[i][1] = allists.get(i).get(1);
        }
        return res;
    }
}
