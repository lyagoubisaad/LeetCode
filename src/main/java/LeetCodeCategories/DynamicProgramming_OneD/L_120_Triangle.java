package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_120_Triangle {

    int min = Integer.MAX_VALUE;

    public int minimumTotal(List<List<Integer>> triangle) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        map.put(List.of(-1,0), 0);
        helper(triangle, 0, 0, map);
        return min;
    }

    private void helper(List<List<Integer>> triangle, int floor, int idx, Map<List<Integer>, Integer> map) {
        if(map.containsKey(List.of(floor, idx))) return;
        if(idx >= triangle.get(floor).size()) return;
        int curr = triangle.get(floor).get(idx);
        int prvHor = map.getOrDefault(List.of(floor-1, idx), Integer.MAX_VALUE);
        int prvVer = map.getOrDefault(List.of(floor-1, idx-1), Integer.MAX_VALUE);
        map.put(List.of(floor, idx), curr+Math.min(prvVer, prvHor));
        if(floor == triangle.size()-1) {
            min = Math.min(min, map.get(List.of(floor, idx)));
            return;
        }
        helper(triangle, floor+1, idx, map);
        helper(triangle, floor+1, idx+1, map);
    }
}
