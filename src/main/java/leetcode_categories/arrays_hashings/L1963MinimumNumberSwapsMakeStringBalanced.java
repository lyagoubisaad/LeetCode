package leetcode_categories.arrays_hashings;

public class L1963MinimumNumberSwapsMakeStringBalanced {
    public int minSwaps(String s) {
        int open = 0;
        int total = 0;
        for (char c: s.toCharArray()) {
            if(c == '[') open++;
            else {
                if(open == 0) {
                    total++;
                    open++;
                }
                else open--;
            }
        }
        return total;
    }
}
