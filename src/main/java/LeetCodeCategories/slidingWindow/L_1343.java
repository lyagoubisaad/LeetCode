package LeetCodeCategories.slidingWindow;

public class L_1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        int sum = 0;
        for (int j=0;j<k;j++) {
            sum += arr[j];
        }
        if(sum >= threshold * k) {
            result++;
        }
        for (int i=1;i<=arr.length-k;i++) {
            sum -= arr[i-1];
            sum += arr[i+k-1];
            if(sum >= threshold*k) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5);
    }
}
