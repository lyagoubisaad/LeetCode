package LeetCodeCategories.slidingWindow;

public class L_3_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int max = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            int idx = sb.indexOf(String.valueOf(s.charAt(i)));
            if(idx != -1) {
                max = Math.max(max, sb.length());
                sb.delete(0, idx + 1);
            }
            sb.append(s.charAt(i));
        }
        return Math.max(sb.length(), max);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}
