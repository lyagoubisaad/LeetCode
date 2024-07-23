package leetcode_categories.arrays_hashings;

public class L1299ReplaceElementsGreatestElementRightSide {
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;
        int tmp;
        for (int i=arr.length-1;i>=0;i--) {
            tmp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(tmp, maxRight);
        }
        return arr;
    }
}
