package LeetCodeCategories.slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L_658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int diff = Integer.MAX_VALUE;
        int idx = -1;
        for (int i=0;i<arr.length;i++) {
            if(x == arr[i] ) {
                idx = i;
                break;
            }
            if(Math.abs(x-arr[i]) < diff) {
                diff = Math.abs(x-arr[i]);
                idx = i;
            }
        }
        int l = idx-1;
        int r = idx+1;
        List<Integer> store = new ArrayList<>();
        store.add(arr[idx]);
        while (store.size() < k && l>=0 && r<arr.length) {
            if(Math.abs(arr[r] - x) < Math.abs(arr[l] - x)) {
                store.add(arr[r]);
                r++;
            } else {
                store.add(arr[l]);
                l--;
            }
        }
        if(store.size() == k) {
            Collections.sort(store);
            return store;
        }
        if(l == -1) {
            while (store.size() < k) {
                store.add(arr[r]);
                r++;
            }
        } else {
            while (store.size() < k) {
                store.add(arr[l]);
                l--;
            }
        }
        Collections.sort(store);
        return store;
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

    public static void main(String[] args) {

    }
}
