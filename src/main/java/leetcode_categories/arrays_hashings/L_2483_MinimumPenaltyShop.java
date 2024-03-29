package leetcode_categories.arrays_hashings;

public class L_2483_MinimumPenaltyShop {

    public static int bestClosingTimeV1(String customers) {
        int score = 0;
        int bestIdx = 0;
        char[] cs = customers.toCharArray();
        int length = cs.length;
        for (int c:cs) {
            if(c=='Y') score++;
        }
        int maxScore = score;
        for (int i=1;i<=length;i++) {
            if (cs[i-1] == 'Y') score--;
            else score++;
            if(score > maxScore) {
                bestIdx = i;
                maxScore = score;
            }
        }
        return bestIdx;
    }
    public static int bestClosingTime(String customers) {
        int score = 0;
        int bestIdx = 0;
        char[] cs = customers.toCharArray();
        int length = cs.length;
        for (int i=0;i<length;i++) {
            if (cs[i] == 'Y') score--;
            else score++;
            if(score < 0) {
                score = 0;
                bestIdx = i+1;
            }
        }
        return bestIdx;
    }
}
