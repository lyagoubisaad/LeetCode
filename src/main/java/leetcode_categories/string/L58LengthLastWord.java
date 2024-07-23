package leetcode_categories.string;

public class L58LengthLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int idx = 0;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') idx = i+1;
        }
        return s.length()-idx;
    }
}
