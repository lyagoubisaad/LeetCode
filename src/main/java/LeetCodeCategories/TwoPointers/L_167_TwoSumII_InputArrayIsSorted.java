package LeetCodeCategories.TwoPointers;

public class L_167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int i= 0;
        int j= numbers.length-1;
        int curSum;
        while (i < j) {
            curSum = numbers[i] + numbers[j];
            if(curSum < target) i++;
            else if(numbers[i] + numbers[j] > target) j--;
            else return new int[] {i+1, j+1};
        }
        return new int[2];
    }

    public static void main(String[] args) {

    }
}
