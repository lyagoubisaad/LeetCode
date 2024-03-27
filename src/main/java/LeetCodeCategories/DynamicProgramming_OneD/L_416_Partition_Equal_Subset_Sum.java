package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L_416_Partition_Equal_Subset_Sum {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;
        sum = sum /2;
        Set<Integer> set = new HashSet();
        set.add(0);
        List<Integer> tmp = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            for (int elem: set) {
                if(nums[i] + elem == sum) return true;
                tmp.add(nums[i] + elem);
            }
            set.addAll(tmp);
            tmp.clear();
        }
        return false;
    }

    public static void main(String[] args) {
        canPartition(new int[]{1,2,3,5});
    }
}
