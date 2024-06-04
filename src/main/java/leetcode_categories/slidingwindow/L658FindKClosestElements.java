package leetcode_categories.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class L658FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0, hi = arr.length - k, mid;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = lo; i < lo + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    /*
    Code to be reviewed
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0, hi = arr.length - k;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            // index mid and mid + k: only one of them could possibly be in a final answer
            // If the element at arr[mid] is closer to x than arr[mid + k], then that means
            // arr[mid + k], as well as every element to the right of it can never be in the
            // answer. This means we should move our right pointer to avoid considering them.
            if (x - arr[mid] > arr[mid + k] - x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = lo; i < lo + k; i++) {
            res.add(arr[i]);
        }

        return res;
    }
    */
}
