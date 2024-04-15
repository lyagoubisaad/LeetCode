package leetcode_categories.arrays_hashings;

import java.util.PriorityQueue;

public class L912SortAnArray {

    public int[] heapSortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Integer::compare);
        for (int num : nums) {
            minHeap.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = minHeap.poll();
        }
        return nums;
    }

    public int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int key = nums[i];
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int key = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    key = j;
                    min = nums[j];
                }
            }
            nums[key] = nums[i];
            nums[i] = min;
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        if (nums.length == 1) return nums;
        int[] leftNums = new int[nums.length/2];
        System.arraycopy(nums, 0, leftNums, 0, leftNums.length);
        sortArray(leftNums);
        int[] rightNums = new int[nums.length - leftNums.length];
        System.arraycopy(nums, leftNums.length, rightNums, 0, rightNums.length);
        sortArray(rightNums);
        merge(nums, leftNums, rightNums);
        return nums;
    }

    private void merge(int[] nums, int[] leftNums, int[] rightNums) {
        int i = 0, j = 0, k = 0;
        while (i < leftNums.length && j < rightNums.length) nums[k++] = leftNums[i] < rightNums[j] ? leftNums[i++]: rightNums[j++];
        System.arraycopy(leftNums, i, nums, k, leftNums.length - i);
        System.arraycopy(rightNums, j, nums, k, rightNums.length - j);
    }
}
