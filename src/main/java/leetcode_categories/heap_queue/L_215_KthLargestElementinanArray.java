package leetcode_categories.heap_queue;

import java.util.PriorityQueue;

public class L_215_KthLargestElementinanArray {
    PriorityQueue<Integer> heap = new PriorityQueue();
    int k;
    public int findKthLargest(int[] nums, int k) {
        this.k = k;
        for (int i=0;i<nums.length;i++) {
            add(nums[i]);
        }
        return heap.poll();
    }

    private void add(int num) {
        heap.offer(num);
        if(heap.size() > k) heap.poll();
    }


    public static void main(String[] args) {
        new L_215_KthLargestElementinanArray().findKthLargest(new int[] {3,2,1,5,6,4}, 2);
    }
}
