package LeetCodeCategories.ArrayAndHashings;

public class L_535_EncodeAndDecodeTinyURL {
    public static String reverseString(String longUrl) {
        char[] longUrlChars = longUrl.toCharArray();
        int left = 0;
        int right = longUrlChars.length-1;
        while (left < right) {
            char tmp = longUrl.charAt(right);
            longUrlChars[right] = longUrlChars[left];
            longUrlChars[left] = tmp;
            left++;right--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<longUrlChars.length;i++) {
            sb.append(longUrlChars[i]);
        }
        return sb.toString();
    }

    public static String encode(String longUrl) {
        return longUrl + " ";
    }

    public static String decode(String shortUrl) {
        return shortUrl.substring(0,shortUrl.length()-1);
    }

    public static void main(String[] args) {
        String input = "https://leetcode.com/problems/design-tinyurl";
        System.out.println(input.equals(decode(encode(input))));
    }
}
