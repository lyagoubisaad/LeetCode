package LeetCodeCategories.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_1968 {

    public static double findMedian(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array

        int n = nums.length;
        if (n % 2 == 0) {
            // Step 2: If even number of elements, calculate the average of the two middle elements
            int middle1 = nums[n / 2 - 1];
            int middle2 = nums[n / 2];
            return (double) (middle1 + middle2) / 2.0;
        } else {
            // Step 3: If odd number of elements, the median is the middle element
            return (double) nums[n / 2];
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        double median = findMedian(nums);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            if(nums[i] < median) odd.add(nums[i]);
            else even.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++) {
            if(odd.isEmpty()) nums[i] = even.remove(0);
            else if(even.isEmpty()) nums[i] = odd.remove(0);
            else if(i%2 == 0) nums[i] = even.remove(0);
            else nums[i] = odd.remove(0);
        }
        return nums;
    }

    public static void main(String[] args) {
        rearrangeArray(new int[] {4,1,2,3});
    }
}
