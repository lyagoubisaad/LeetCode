package leetcode_categories.slidingwindow;

public class L3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length = 0;
        char[] array = s.toCharArray();
        while (right < array.length) {
            for (int i=left;i<right;i++) {
                if(array[i] == array[right]) {
                    left = i + 1;
                    break;
                }
            }
            length = Math.max(length, right-left+1);
            right++;
        }
        return length;
    }
}
