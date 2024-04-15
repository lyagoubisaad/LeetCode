package leetcode_categories.arrays_hashings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L554BrickWall {
    public int leastBricks(List<List<Integer>> walls) {
        int sum;
        HashMap<Integer, Integer> store = new HashMap<>();
        for (List<Integer> wall: walls) {
            sum = 0;
            for (int i=0;i<wall.size()-1;i++) {
                sum += wall.get(i);
                store.put(sum, store.getOrDefault(sum, 0)+1);
            }
        }
        if(store.isEmpty()) return walls.size();
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry: store.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return walls.size()-max;
    }
}
