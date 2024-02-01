package LeetCodeCategories.Greedy;

public class L_978_LongestTurbulentSubarray {
    public static int maxTurbulenceSize(int[] arr) {
        int inc = 1;  // Length of the current increasing sequence
        int dec = 1;  // Length of the current decreasing sequence
        int maxLen = 1;  // Maximum turbulent subarray length

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                inc = dec + 1;
                dec = 1;
            } else if (arr[i] < arr[i - 1]) {
                dec = inc + 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }



}
