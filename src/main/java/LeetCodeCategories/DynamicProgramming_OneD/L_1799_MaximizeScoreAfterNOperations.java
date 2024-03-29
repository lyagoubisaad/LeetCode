package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.*;

public class L_1799_MaximizeScoreAfterNOperations {
    public int maxScore(int[] nums) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        HashSet<Integer> storeSet = new HashSet<>();
        HashMap<Integer, Integer> storeGcd = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int firstNumber = nums[i];
            storeSet.add(firstNumber);
            for (int j=i+1;j<nums.length;j++) {
                int secondNumber = nums[j];
                int gcdResult = gcd(firstNumber, secondNumber);
                queue.add(new int[] {gcdResult, firstNumber, secondNumber});
                storeGcd.put(gcdResult, storeGcd.getOrDefault(gcdResult, 0)+1);
            }
        }
        int length = nums.length/2;
        return helper(storeSet, storeGcd, queue, length);
    }

    public int helper(HashSet<Integer> storeSet, HashMap<Integer, Integer> storeGcd, Queue<int[]> queue, int length) {
        if (length == 0) return 0;
        int maxResult = 0;
        while (!storeSet.contains(queue.peek()[1]) || !storeSet.contains(queue.peek()[2])) queue.poll();
        int size = storeGcd.get(queue.peek()[0]);
        for (int i = 0; i < size; i++) {
            int[] elements = queue.poll();
            if(!storeSet.contains(elements[1]) || !storeSet.contains(elements[2])) {
                queue.offer(elements);
                continue;
            }
            storeSet.remove(elements[1]);
            storeSet.remove(elements[2]);
            maxResult = Math.max(length * elements[0] + helper(storeSet, storeGcd, new ArrayDeque<>(queue), length - 1), maxResult);
            storeSet.add(elements[1]);
            storeSet.add(elements[2]);
            queue.offer(elements);
        }
        return maxResult;
    }

    public int gcd(int num1, int num2) {
        if(num1 == num2) return num1;
        if(num1 > num2) return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }

}
