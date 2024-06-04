package leetcode_categories.string;

public class L3110ScoreString {
    public int scoreOfString(String s) {
        int prv = s.charAt(0)-'a';
        char[] chars = s.toCharArray();
        int score = 0;
        for (int i=1;i<chars.length;i++) {
            score += Math.abs(prv - (chars[i]-'a'));
            prv = chars[i] - 'a';
        }
        return score;
    }
}
