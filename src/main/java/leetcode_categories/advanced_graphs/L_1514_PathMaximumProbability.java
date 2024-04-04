package leetcode_categories.advanced_graphs;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

class L_1514_PathMaximumProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        HashMap<Integer, List<double[]>> adjacencyMap = new HashMap<>();
        for (int i=0;i<edges.length;i++) {
            adjacencyMap.computeIfAbsent(edges[i][0], val -> new ArrayList<>()).add(new double[] {succProb[i], edges[i][1]});
            adjacencyMap.computeIfAbsent(edges[i][1], val -> new ArrayList<>()).add(new double[] {succProb[i], edges[i][0]});
        }
        PriorityQueue<double[]> minHeap = new PriorityQueue<>(Comparator.comparingDouble(arr -> -arr[0]));
        boolean[] seen = new boolean[n];
        minHeap.add(new double[] {1, start_node});
        while (!minHeap.isEmpty()) {
            double[] element = minHeap.poll();
            int currNode = (int) element[1];
            if(currNode == end_node) return convert(element[0]);
            seen[currNode] = true;
            for (double[] adjacent: adjacencyMap.getOrDefault(currNode, new ArrayList<>())) {
                if(seen[(int) adjacent[1]]) continue;
                minHeap.add(new double[] {element[0]*adjacent[0], adjacent[1]});
            }
        }
        return 0.00000;
    }

    public double convert(double number) {
        //input: 0.344138400144 | Output: 0.34414
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.#####", symbols);
        String formattedNumberString = df.format(number);
        return Double.parseDouble(formattedNumberString);
    }
}
