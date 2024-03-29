package leetcode_categories.arrays_hashings;

import java.util.Iterator;
import java.util.TreeSet;

public class L_414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        TreeSet ts = new TreeSet();
        for (int elem : nums) {
            ts.add(elem);
        }
        ts = (TreeSet) ts.descendingSet();
        Iterator<Integer> it = ts.iterator();
        if(ts.size() < 3 ) {
            return it.next();
        }
        int cpt = 0;
        int current = 0;
        while(it.hasNext() && cpt < 3) {
            current = it.next();
            cpt++;
        }
        return current;
    }
}
