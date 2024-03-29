package leetcode_categories.string;

public class L_28_Find_the_IndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        char firstOfNeedle = needle.charAt(0);
        for (int i=0;i<haystack.length();i++) {
            int endIndex = i + needle.length();
            if(endIndex >haystack.length()) return -1;
            if(haystack.charAt(i) == firstOfNeedle)
                if(haystack.substring(i, endIndex).equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        strStr("hello","ll");
    }
}
