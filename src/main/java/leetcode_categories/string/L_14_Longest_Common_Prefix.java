package leetcode_categories.string;

public class L_14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for (int i=1;i<strs.length;i++) {
            while(strs[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] s2 = {"c", "acc", "ccc"};
        System.out.println(longestCommonPrefix(s2));
    }
}
