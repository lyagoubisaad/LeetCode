package leetcode_categories.dynamic_programming_1d;

import java.math.BigInteger;

public class L152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        BigInteger prvMax = BigInteger.valueOf(nums[0]);
        BigInteger max = prvMax;
        BigInteger prvMin = BigInteger.valueOf(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            BigInteger num = BigInteger.valueOf(nums[i]);
            if (nums[i] == 0) {
                prvMax = BigInteger.ZERO;
                prvMin = BigInteger.ZERO;
                max = max.max(BigInteger.ZERO);
            } else {
                BigInteger tempPrvMax = prvMax;
                prvMax = num.max(tempPrvMax.multiply(num).max(prvMin.multiply(num)));
                prvMin = num.min(tempPrvMax.multiply(num).min(prvMin.multiply(num)));
                max = max.max(prvMax);
            }
        }
        return max.intValue();
    }
}
