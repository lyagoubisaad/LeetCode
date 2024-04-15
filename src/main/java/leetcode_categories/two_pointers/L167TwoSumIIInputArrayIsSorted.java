package leetcode_categories.two_pointers;

public class L167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int currSum;
        while (left<right) {
            currSum = numbers[left] + numbers[right];
            if(currSum < target) left++;
            if(currSum > target) right--;
            else return new int[] {left+1, right+1};
        }
        return new int[] {};
    }
}
