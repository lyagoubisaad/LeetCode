package LeetCodeCategories.ArrayAndHashings;

import java.util.ArrayList;

public class L_905_SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        ArrayList imp = new ArrayList();
        ArrayList pair = new ArrayList();
        for (int i=0;i<nums.length;i++) {
            if(nums[i] % 2 != 0) {
                imp.add(nums[i]);
            }
            else {
                pair.add(nums[i]);
            }
        }
        if(imp.size() == 0) return nums;
        if(pair.size() == 0) return nums;
        int tmp = pair.size()+imp.size();
        for (int i=pair.size();i<tmp;i++) {
            nums[i] = (int) imp.get(0);
            imp.remove(0);
        }
        tmp = pair.size();
        for (int i=0;i<tmp;i++) {
            nums[i] = (int) pair.get(0);
            pair.remove(0);
        }
        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        sortArrayByParity(new int[] {0,2,1,4});
    }
}
