package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class L_1048_LongestStringChain {
        public static int longestStrChain(String[] words) {
            Arrays.sort(words, Comparator.comparingInt(String::length));
            Map<String, Integer> dp = new HashMap<>();
            int maxChainLength = 0;
            for (String word : words) {
                int currChainLength = 1;

                for (int i = 0; i < word.length(); i++) {
                    StringBuilder sb = new StringBuilder(word);
                    sb.deleteCharAt(i);
                    String pred = sb.toString();
                    if (dp.containsKey(pred)) {
                        currChainLength = Math.max(currChainLength, dp.get(pred) + 1);
                    }
                }
                dp.put(word, currChainLength);
                maxChainLength = Math.max(maxChainLength, currChainLength);
            }
            return maxChainLength;
        }


    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        System.out.println(longestStrChain(words));
    }
}
