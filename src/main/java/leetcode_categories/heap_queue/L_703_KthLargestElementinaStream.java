package leetcode_categories.heap_queue;

import java.util.PriorityQueue;

public class L_703_KthLargestElementinaStream {
    int k;
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    public L_703_KthLargestElementinaStream(int k, int[] nums) {
        this.k = k;
        for (int i=0;i<nums.length;i++) {
            add(nums[i]);
        }
    }

    int add(int i) {
        heap.offer(i);
        if(heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        L_703_KthLargestElementinaStream stream = new L_703_KthLargestElementinaStream(1, new int[] {});
        System.out.println(stream.add(-3));
        System.out.println(stream.add(-2));
        System.out.println(stream.add(-4));
        System.out.println(stream.add(0));
        System.out.println(stream.add(4));
    }


}
