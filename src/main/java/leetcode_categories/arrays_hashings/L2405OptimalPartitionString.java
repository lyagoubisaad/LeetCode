package leetcode_categories.arrays_hashings;

public class L2405OptimalPartitionString {
    public int partitionString(String s) {
        boolean[] array = new boolean[26];
        int sum = 1;
        for (char c: s.toCharArray()) {
            if(array[c-'a']) {
                sum++;
                array = new boolean[26];
            }
            array[c-'a'] = true;
        }
        return sum;
    }
}
