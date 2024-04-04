package leetcode_categories.advanced_graphs;

import java.util.*;

public class L_332_ReconstructItinerary {
    private List<String> result = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> adjacencyList = buildAdjacencyList(tickets);
        dfs("JFK", adjacencyList);
        return result;
    }

    private Map<String, List<String>> buildAdjacencyList(List<List<String>> tickets) {
        Map<String, List<String>> adjacencyList = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            adjacencyList.computeIfAbsent(from, key -> new ArrayList<>()).add(to);
        }
        adjacencyList.forEach((key, value) -> value.sort(String::compareTo));
        return adjacencyList;
    }

    private void dfs(String from, Map<String, List<String>> adjacencyList) {
        List<String> toAirports = adjacencyList.getOrDefault(from, Collections.emptyList());
        while (!toAirports.isEmpty()) {
            Collections.sort(toAirports);
            String nextAirport = toAirports.remove(0);
            dfs(nextAirport, adjacencyList);
        }
        result.add(0, from);
    }
}
