package LeetCodeCategories.ArrayAndHashings;

public class L_1963_MinimumNumberOfSwapstoMaketheStringBalanced {
    public static int minSwaps(String s) {
        int diff = 0;
        int res = 0;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == '[') diff--; else {
                diff++;
            }
            res = Math.max(res, diff);
        }
        return (res+1)/2;
    }

    public static void main(String[] args) {
        minSwaps("][[]][][[][]");
    }
}
