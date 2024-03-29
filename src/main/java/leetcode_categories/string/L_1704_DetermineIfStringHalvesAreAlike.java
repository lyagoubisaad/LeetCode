package leetcode_categories.string;

public class L_1704_DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int tot = 0;
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
                if(i<s.length()/2) tot++;
                else tot--;
            }
        }
        return tot == 0;
    }
}
