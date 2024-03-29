package leetcode_categories.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class L_239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;
        if (k == 0) return null;

        int n = nums.length;
        int[] res = new int[n - k + 1];
        int resIndex = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements smaller than the current element from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.offer(i);

            // Add the maximum element for the current window to the result array
            if (i >= k - 1) {
                res[resIndex++] = nums[deque.peek()];
            }
        }
        return res;
    }

}
