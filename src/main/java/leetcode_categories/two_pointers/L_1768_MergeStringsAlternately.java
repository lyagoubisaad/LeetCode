package leetcode_categories.two_pointers;

public class L_1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<word1.length() || i<word2.length()) {
            if(i<word1.length()) sb.append(word1.charAt(i));
            if(i<word2.length()) sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
