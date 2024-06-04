package leetcode_categories.slidingwindow;

public class L1343NumberSubArraysSizeKAverageGreaterEqualThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int numOfSubarrays = 0;
        for (int i=0;i<k;i++) {
            sum += arr[i];
        }
        if(sum >= threshold*k) numOfSubarrays++;
        for (int i=1;i<=arr.length-k;i++) {
            sum -= arr[i-1];
            sum += arr[k+i-1];
            if(sum >= threshold*k) numOfSubarrays++;
        }
        return numOfSubarrays;
    }
}
