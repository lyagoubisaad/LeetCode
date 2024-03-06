package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class L_2477_MinimumFuelCostReportCapital {

    long fuel = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        HashMap<Integer, List<Integer>> roadsMap = new HashMap<>();
        for (int[] road: roads) {
            roadsMap.computeIfAbsent(road[0],val -> new ArrayList<>()).add(road[1]);
            roadsMap.computeIfAbsent(road[1],val -> new ArrayList<>()).add(road[0]);
        }
        if(roadsMap.isEmpty()) return 0;
        HashSet<Integer> seen = new HashSet<>();
        seen.add(0);
        dfs(0, seats, roadsMap, seen);
        return fuel;
    }

    private long dfs(int node, int seats, HashMap<Integer, List<Integer>> roadsMap, HashSet<Integer> seen){
        long passengers = 0;
        for(int child : roadsMap.get(node)){
            if(seen.add(child)){
                long p = dfs(child, seats, roadsMap, seen);
                passengers += p;
                fuel += Math.ceil((double)p/seats);
            }
        }
        return passengers + 1;
    }
}
