package LeetCodeCategories.Heap_Queue;

import java.util.PriorityQueue;

public class L_1046_LastStoneWeight {
    public int lastStoneWeight(int [] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i=0;i<stones.length;i++) {
            heap.offer(-stones[i]);
        }
        while (heap.size() > 1) {
            int firstElement = -heap.poll();
            int secondElement = -heap.poll();
            int thirdElement = Math.abs(firstElement-secondElement);
            if(thirdElement !=0) {
                heap.offer(-thirdElement);
            }
        }
        if(heap.size() == 1) return -heap.peek();
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new L_1046_LastStoneWeight().lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }
}
