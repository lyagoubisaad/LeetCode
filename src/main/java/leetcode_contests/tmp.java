package leetcode_contests;

import java.util.*;

public class tmp {
    //100294. Count the Number of Special Characters I
    //100291. Count the Number of Special Characters II
    //100290. Minimum Number of Operations to Satisfy Conditions (graph)
    public static int numberOfSpecialChars1(String word) {
        char[] wordArray = word.toCharArray();
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];
        int cpt = 0;
        for (char c: wordArray) {
            int value = c - 'A';
            if(value >= 32) {
                upper[value-32] = true;
            } else {
                lower[value] = true;
            }
        }
        for (int i=0;i<26;i++) {
            if(lower[i] && upper[i]) cpt++;
        }
        return cpt;
    }

    public static int numberOfSpecialChars(String word) {
        char[] wordArray = word.toCharArray();
        int[] upper = new int[26];
        int[] lower = new int[26];
        Arrays.fill(upper, Integer.MAX_VALUE);
        Arrays.fill(lower, -1);
        int cpt = 0;
        for (int i=0;i<wordArray.length;i++) {
            int value = wordArray[i] - 'A';
            if(value >= 32) {
                lower[value-32] = Math.max(lower[value-32],i);
            } else {
                upper[value] = Math.min(upper[value],i);
            }
        }
        for (int i=0;i<26;i++) {
            if(lower[i] == -1 || upper[i] == Integer.MAX_VALUE) continue;
            if(lower[i] < upper[i]) cpt++;
        }
        return cpt;
    }

    public int minimumOperations(int[][] grid) {
        int minimumOperations = 0;
        List<PriorityQueue<int[]>> list = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a[1]));
        for (int i=0;i<grid[0].length;i++) {
            queue.clear();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j=0;j<grid.length;j++) {
                int val = grid[j][i];
                map.put(val, map.getOrDefault(val, 0)+1);
            }
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                queue.add(new int[] {entry.getKey(), entry.getValue()});
            }
            list.add(new PriorityQueue<>(queue));
        }
        int before = -1;
        int after;
        for (int i=0;i<grid[0].length;i++) {
            queue = list.get(i);
            if(i!= grid[0].length-1) {
                after = list.get(i+1).peek()[0];
            } else after = -1;
            int[] first = queue.poll();
            if(before != -1) {
                while (!queue.isEmpty() && (first[0] == before || first[0] == after)) first = queue.poll();
            }
            if(first[0] == before || first[0] == after) {
                before = -1;
                minimumOperations += grid.length;
            }
            else {
                minimumOperations += grid.length-first[1];
                before = first[0];
            }
        }
        return minimumOperations;
    }

    public static void main(String[] args) {
        numberOfSpecialChars("aaAbcBC");
    }
}
