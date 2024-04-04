package leetcode_categories.advanced_graphs;

import java.util.*;

public class L_787_CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer, HashMap<Integer, Boolean>> seen = new HashMap<>();
        HashMap<Integer, List<int[]>> flightsMap = new HashMap<>();
        for (int[] flight : flights) {
            flightsMap.computeIfAbsent(flight[0], val -> new ArrayList<>()).add(new int[]{flight[2], flight[1]});
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[]{0, src, k + 1});
        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            int distance = element[0];
            int airPort = element[1];
            int stops = element[2];
            if (airPort == dst) return distance;
            if (stops-- == 0) continue;
            seen.putIfAbsent(airPort, new HashMap<>());
            seen.get(airPort).put(stops, true);
            for (int[] nextElement : flightsMap.getOrDefault(airPort, new ArrayList<>())) {
                if (seen.containsKey(nextElement[1]) && seen.get(nextElement[1]).containsKey(stops)) continue;
                minHeap.add(new int[]{nextElement[0] + distance, nextElement[1], stops});
            }
        }
        return -1;
    }
}
