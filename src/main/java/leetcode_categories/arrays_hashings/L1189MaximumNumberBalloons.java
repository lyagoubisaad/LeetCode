package leetcode_categories.arrays_hashings;

public class L1189MaximumNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        char[] characters  = text.toCharArray();
        int maxNbr;
        int[] occ = new int[26];
        for (char character : characters) {
            occ[character - 'a']++;
        }
        maxNbr = Math.min(occ[0], occ[1]);
        maxNbr = Math.min(maxNbr, occ[11]/2);
        maxNbr = Math.min(maxNbr, occ[14]/2);
        maxNbr = Math.min(maxNbr, occ[13]);
        return maxNbr;
    }
}
