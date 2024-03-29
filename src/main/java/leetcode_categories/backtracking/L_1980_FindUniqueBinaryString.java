package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_1980_FindUniqueBinaryString {
    public static String findDifferentBinaryString(String[] nums) {
        int length = nums[0].length();
        double max = Math.pow(2, length);
        List<String> allNbrs = new ArrayList<>();
        for (int i=0;i<max;i++) {
            StringBuilder element = new StringBuilder(Integer.toBinaryString(i));
            while (element.length() != length) element.insert(0, '0');
            allNbrs.add(element.toString());
        }
        for (String num: nums) {
            allNbrs.remove(num);
        }
        return allNbrs.get(0);
    }
}
