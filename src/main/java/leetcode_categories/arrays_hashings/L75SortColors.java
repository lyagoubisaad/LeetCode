package leetcode_categories.arrays_hashings;

public class L75SortColors {
    public void sortColors(int[] nums) {
        if(nums.length == 1) return;
        int mid = nums.length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[nums.length-leftArray.length];
        System.arraycopy(nums, 0, leftArray, 0, leftArray.length);
        System.arraycopy(nums, mid, rightArray, 0, rightArray.length);
        sortColors(leftArray);
        sortColors(rightArray);
        mergeSort(leftArray, rightArray, nums);
    }

    private void mergeSort(int[] leftArray, int[] rightArray, int[] nums) {
        int i=0, j=0, k=0;
        while (i<leftArray.length && j<rightArray.length) {
            nums[k++] = leftArray[i] < rightArray[j]? leftArray[i++]: rightArray[j++];
        }
        System.arraycopy(leftArray, i, nums, k, leftArray.length-i);
        System.arraycopy(rightArray, j, nums, k, rightArray.length-j);
    }
}
