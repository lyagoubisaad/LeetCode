package leetcode_categories.slidingwindow;

public class L567PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int[] count = new int[26];
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int s1Length = arr1.length;
        for (char c : arr1) {
            count[c - 'a']++;
        }
        for (int i = 0; i < arr2.length; i++) {
            count[arr2[i] - 'a']--;
            while (count[arr2[i] - 'a'] < 0) {
                count[arr2[left] - 'a']++;
                left++;
            }
            if (i - left + 1 == s1Length) return true;
        }
        return false;
    }
}
