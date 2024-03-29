package leetcode_categories.dynamic_programming_1d;
public class L_2369_CheckThereIsValidPartitionForTheArray {
    public boolean validPartition(int[] nums) {
        if (nums.length == 0) return true;
        if (nums.length == 1) return false;

        Boolean[] memo = new Boolean[nums.length];
        return validPartitionHelper(nums, 0, memo);
    }

    private boolean validPartitionHelper(int[] nums, int start, Boolean[] memo) {
        if (start >= nums.length) return true;
        if (memo[start] != null) return memo[start];

        int first = nums[start];
        if (start + 1 < nums.length) {
            int second = nums[start + 1];
            if (first == second || first == second - 1) {
                if (first == second && validPartitionHelper(nums, start + 2, memo)) {
                    memo[start] = true;
                    return true;
                }
                if (start + 2 < nums.length) {
                    int third = nums[start + 2];
                    if ((third == first && second == first) || (third == first + 2 && second == first+1)) {
                        if (validPartitionHelper(nums, start + 3, memo)) {
                            memo[start] = true;
                            return true;
                        }
                    }
                }
            }
        }
        memo[start] = false;
        return false;
    }


}
