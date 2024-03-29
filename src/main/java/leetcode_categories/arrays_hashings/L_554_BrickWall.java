package leetcode_categories.arrays_hashings;

import java.util.*;

public class L_554_BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> store = new HashMap<>();
        int max = 0;
        int size = wall.size();
        for (int i=0;i<size;i++) {
            int border = 0;
            for (int j=0;j<wall.get(i).size()-1;j++) {
                border += wall.get(i).get(j);
                store.put(border, store.getOrDefault(border, 0) + 1);
            }
        }
        for(Map.Entry<Integer,Integer>num : store.entrySet()){
            int val = num.getValue();
            max = Math.max(max,val);
        }
        return size-max;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 2, 1));
        list.add(Arrays.asList(3,1,2));
        list.add(Arrays.asList(1,3,2));
        list.add(Arrays.asList(2,4));
        list.add(Arrays.asList(3,1,2));
        list.add(Arrays.asList(1,3,1,1));
        new L_554_BrickWall().leastBricks(list);
    }
}
