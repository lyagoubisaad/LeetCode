package leetcode_categories.dynamic_programming_2d;

import java.util.HashMap;

public class L97InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        HashMap<String, Boolean> cache = new HashMap<>();
        return helper( s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0, cache);
    }
    private boolean helper(char[] charS1, int i, char[] charS2, int j, char[] charS3, int k, HashMap<String, Boolean> cache) {
        if(k == charS3.length) {
            return i == charS1.length && j == charS2.length;
        }
        String key = i + "+" + j + "+" + k;
        if(cache.containsKey(key)) return cache.get(key);
        boolean value = false;
        if(i<charS1.length && j < charS2.length && charS3[k] == charS1[i] && charS3[k] == charS2[j]) {
            value = helper(charS1, i+1, charS2, j, charS3, k+1, cache) || helper(charS1, i, charS2, j+1, charS3, k+1, cache);
        }
        else if(i < charS1.length && charS3[k] == charS1[i]) {
            value = helper(charS1, i+1, charS2, j, charS3, k+1, cache);
        }
        else if(j < charS2.length && charS3[k] == charS2[j]) {
            value = helper(charS1, i, charS2, j+1, charS3, k+1, cache);
        }
        cache.put(key, value);
        return cache.get(key);
    }

    public static void main(String[] args) {
        System.out.println(new L97InterleavingString().isInterleave("a", "b", "a"));
    }
}
