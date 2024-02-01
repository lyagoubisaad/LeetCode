package LeetCodeCategories.ArrayAndHashings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_2002_MaximumProductOfTheLengthOfTwoPalindromicSubsequences {
    public static int maxProduct(String s) {
        HashMap<Integer, Integer> store = new HashMap<>();
        List<Integer> allPalindromes = generateBitRepresentations(s, store);
        int max = 0;
        for (int i=0;i<allPalindromes.size();i++) {
            for (int j=i+1;j<allPalindromes.size();j++) {
                if((allPalindromes.get(i) & allPalindromes.get(j)) == 0) {
                    max = Math.max(store.get(allPalindromes.get(i)) * store.get(allPalindromes.get(j)), max);
                }
            }
        }
        return max;
    }
    public static List<Integer> generateBitRepresentations(String inputStr, HashMap<Integer,Integer> store) {
        List<Integer> bitRepresentations = new ArrayList<>();
        int n = inputStr.length();

        // Iterate through all possible bitmasks
        for (int mask = 0; mask < (1 << n); mask++) {
            if (isBitRepresentationPalindrome(mask, inputStr)) {
                bitRepresentations.add(mask);
                store.put(mask, countOnes(mask));
            }
        }
        return bitRepresentations;
    }
    private static boolean isBitRepresentationPalindrome(int mask, String inputStr) {
        StringBuilder substring = new StringBuilder();

        // Construct substring based on the bitmask
        for (int i = 0; i < inputStr.length(); i++) {
            if ((mask & (1 << i)) != 0) {
                substring.append(inputStr.charAt(i));
            }
        }

        // Check if the constructed substring is a palindrome
        return isPalindrome(substring.toString());
    }
    private static int countOnes(int mask) {
        int count = 0;
        while (mask > 0) {
            count += mask & 1;
            //shift all the numbers to the right by one: 5 (101) becomes 2 (10)
            mask >>= 1;
        }
        return count;
    }
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
