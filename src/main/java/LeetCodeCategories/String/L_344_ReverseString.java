package LeetCodeCategories.String;

public class L_344_ReverseString {
    public static void reverseString(char[] s) {
        char tmp;
        for(int i=0;i<s.length/2;i++) {
            tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[] {'h','e','l','l','o'});
    }
}
