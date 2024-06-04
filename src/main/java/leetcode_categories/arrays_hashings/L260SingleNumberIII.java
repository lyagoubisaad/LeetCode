package leetcode_categories.arrays_hashings;

import java.util.HashSet;
import java.util.Iterator;

public class L260SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        return new int[] {iterator.next(), iterator.next()};
    }
}
