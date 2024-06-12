package leetcode_categories.arrays_hashings;

import java.util.Arrays;
import java.util.HashMap;

public class L1122RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : arr2) {
            map.put(elem, 0);
        }
        for (int elem : arr1) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            }
        }
        int idx = 0;
        int size;
        for (int elem : arr2) {
            size = map.get(elem);
            while (size-- > 0) {
                arr3[idx++] = elem;
            }
        }
        Arrays.sort(arr1);
        for (int elem : arr1) {
            if (map.containsKey(elem)) continue;
            arr3[idx++] = elem;
        }
        return arr3;
    }
}
