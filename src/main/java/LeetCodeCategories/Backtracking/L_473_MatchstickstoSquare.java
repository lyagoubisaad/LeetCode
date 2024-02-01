package LeetCodeCategories.Backtracking;

import java.util.*;

public class L_473_MatchstickstoSquare {

    private static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static boolean makesquare(int[] matchsticks) {
        Map<Integer, Integer> store = new LinkedHashMap<>();
        int sumStore = 0;
        int sum = 0;
        Arrays.sort(matchsticks);
        reverseArray(matchsticks);
        for (int matchstick : matchsticks) {
            store.put(matchstick, store.getOrDefault(matchstick, 0) + 1);
            sumStore++;
            sum += matchstick;
        }
        int avg = sum/4;
        return dfs(0,0,0, store, 0, sumStore, avg);
    }

    private static boolean dfs(int first, int second, int third, Map<Integer, Integer> store, int start, int sumStore, int avg) {
        if(sumStore < 4-start) return false;
        if(first > avg || second > avg || third > avg) return false;
        if(start == 3) {
            int forth = 0;
            for (Map.Entry<Integer, Integer> entry: store.entrySet()) {
                forth += entry.getKey()*entry.getValue();
                if(forth > first || forth > second || forth > third) return false;
            }
            return forth == first && forth == second && forth == third;
        }
        Map<Integer, Integer> storeClone = new LinkedHashMap<>(store);
        for(Map.Entry<Integer, Integer> entry: store.entrySet()) {
            if(entry.getValue() > 0) {
                storeClone.put(entry.getKey(), entry.getValue()-1);
                if(start == 0) {
                    if(entry.getKey()+first > avg) return false;
                    if(dfs(entry.getKey()+first, second, third, new LinkedHashMap<>(storeClone), start+1, sumStore-1, avg)) return true;
                    if(dfs(entry.getKey()+first, second, third, new LinkedHashMap<>(storeClone), start, sumStore-1, avg)) return true;
                }
                if(start == 1) {
                    if(entry.getKey()+second > avg) return false;
                    if(dfs(first, entry.getKey()+second, third, new LinkedHashMap<>(storeClone), start+1, sumStore-1, avg)) return true;
                    if(dfs(first, entry.getKey()+second, third, new LinkedHashMap<>(storeClone), start, sumStore-1, avg)) return true;
                }
                if(start == 2) {
                    if(entry.getKey()+third > avg) return false;
                    if(dfs(first, second, third+entry.getKey(), new LinkedHashMap<>(storeClone), start+1, sumStore-1, avg)) return true;
                    if(dfs(first, second, third+entry.getKey(), new LinkedHashMap<>(storeClone), start, sumStore-1, avg)) return true;
                }
                storeClone.put(entry.getKey(), entry.getValue());
            }
        }
        return false;
    }
}
