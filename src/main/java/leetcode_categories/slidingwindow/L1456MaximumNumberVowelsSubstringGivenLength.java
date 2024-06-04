package leetcode_categories.slidingwindow;

public class L1456MaximumNumberVowelsSubstringGivenLength {
    public int maxVowels(String s, int k) {
        char[] array = s.toCharArray();
        int[] store = new int[26];
        store[0] = 1;
        store[4] = 1;
        store[8] = 1;
        store[14] = 1;
        store[20] = 1;
        int count = 0;
        int i=0;
        for (;i<k;i++) count += store[array[i]-'a'];
        int maxVowels = count;
        for (;i<array.length;i++) {
            count = count - store[array[i-k]-'a'] + store[array[i]-'a'];
            maxVowels = Math.max(maxVowels, count);
        }
        return Math.min(k, maxVowels);
    }
}
