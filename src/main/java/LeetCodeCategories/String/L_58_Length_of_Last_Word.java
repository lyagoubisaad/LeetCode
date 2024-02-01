package LeetCodeCategories.String;

public class L_58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String[] splitStr = s.split("\\s+");
        return splitStr[splitStr.length-1].length();
    }

    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
