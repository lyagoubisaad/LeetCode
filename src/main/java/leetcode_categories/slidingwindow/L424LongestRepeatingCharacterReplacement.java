package leetcode_categories.slidingwindow;

public class L424LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0;
        char[] array = s.toCharArray();
        int[] count = new int[26];
        int mostOcc = 0;
        for (int right = 0; right < array.length; right++) {
            count[array[right] - 'A']++;
            mostOcc = Math.max(mostOcc, count[array[right]-'A']);
            while (right - left + 1 > k + mostOcc ) {
                count[array[left++] - 'A']--;
            }
        }
        return array.length-left;
    }
}