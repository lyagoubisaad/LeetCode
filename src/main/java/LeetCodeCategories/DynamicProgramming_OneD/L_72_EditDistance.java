package LeetCodeCategories.DynamicProgramming_OneD;

public class L_72_EditDistance {

    public static int minDistance(String word1, String word2) {
        int[][] store = new int[word1.length()+1][word2.length()+1];
        for (int i=0;i<word1.length();i++) {
            store[i][word2.length()] = word1.length()-i;
        }
        for (int i=0;i<word2.length();i++) {
            store[word1.length()][i] = word2.length()-i;
        }
        for (int i=word1.length()-1;i>=0;i--){
            for (int j=word2.length()-1;j>=0;j--){
                if(word1.charAt(i) == word2.charAt(j)) {
                    store[i][j] = store[i+1][j+1];
                } else {
                    int tmp = Math.min(store[i+1][j],store[i+1][j+1]);
                    store[i][j] = 1+Math.min(tmp, store[i][j+1]);
                }
            }
        }
        return store[0][0];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
    }
}
