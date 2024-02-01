package LeetCodeCategories.ArrayAndHashings;

public class L_75_SortColors {
    public void sortColors(int[] nums) {
        int nbrOfZeros = 0;
        int nbrOfOnes = 0;
        for (int num: nums) {
            if(num == 0) nbrOfZeros++;
            if(num == 1) nbrOfOnes++;
        }
        for (int i=0;i<nbrOfZeros;i++) {
            nums[i] = 0;
        }
        for (int i=nbrOfZeros;i<nbrOfZeros+nbrOfOnes;i++) {
            nums[i] = 1;
        }

        for (int i=nbrOfZeros+nbrOfOnes;i<nums.length;i++) {
            nums[i] = 2;
        }
    }
}
