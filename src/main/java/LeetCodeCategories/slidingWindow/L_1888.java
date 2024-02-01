package LeetCodeCategories.slidingWindow;

public class L_1888 {
    public static int minFlips(String s) {
        int[][] pos = new int[2][2];
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - '0'][i % 2]++;
        }
        int result = Math.min(pos[0][0] + pos[1][1], pos[0][1] + pos[1][0]);
        if(s.length()%2 ==0) return result;

        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - '0'][i % 2]--;
            pos[s.charAt(i) - '0'][(s.length() + i) % 2]++;

            result = Math.min(result, Math.min(pos[0][0] + pos[1][1], pos[0][1] + pos[1][0]));
        }

        return result;
    }

    public static void main(String[] args) {
        minFlips("10001100101000000");
    }
}
