package leetcode_categories.greedy;

public class L_678_ValidParenthesisString {
    public static boolean checkValidString(String s) {
        int leftMax = 0;
        int leftMin = 0;
        for (Character c: s.toCharArray()) {
            if(c == '*') {
                leftMax++;
                leftMin = Math.max(0, --leftMin);
            }
            else if(c == '(') {
                leftMax++;
                leftMin++;
            } else if(c == ')') {
                leftMax--;
                leftMin = Math.max(0, --leftMin);
            }
            if(leftMax < 0) return false;
        }
        return leftMin == 0 || leftMax == 0;
    }
}
