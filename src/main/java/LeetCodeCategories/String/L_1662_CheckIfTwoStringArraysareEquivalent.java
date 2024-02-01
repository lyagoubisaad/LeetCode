package LeetCodeCategories.String;

public class L_1662_CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String elem : word1) {
            sb.append(elem);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String elem : word2) {
            sb.replace(0,elem.length(),"");
        }
        return sb.compareTo(sb2) == 0;
    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a", "bc"}));
    }
}
