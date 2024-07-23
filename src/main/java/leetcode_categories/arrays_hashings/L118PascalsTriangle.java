package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.List;

public class L118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(List.of(1));
        int size;
        List<Integer> prev;
        List<Integer> curr;
        for (int i=1;i<numRows;i++) {
            pascalTriangle.add(new ArrayList<>());
            size = pascalTriangle.size();
            prev = pascalTriangle.get(size-2);
            curr = pascalTriangle.get(size-1);
            curr.add(1);
            for (int k=0;k<prev.size()-1;k++) {
                curr.add(prev.get(k)+prev.get(k+1));
            }
            curr.add(1);
        }
        return pascalTriangle;
    }

}
