package leetcode_categories.greedy;

public class L2483MinimumPenaltyShop {

    public int bestClosingTime(String customers) {
        int penalty = 0;
        char[] cs = customers.toCharArray();
        int length = cs.length;
        int bestClosingTime = 0;
        for (int i=0;i<length;i++) {
            if(cs[i] == 'Y') {
                penalty--;
            } else {
                penalty++;
            }
            if(penalty < 0) {
                penalty = 0;
                bestClosingTime = i+1;
            }
        }
        return bestClosingTime;
    }

    public int bestClosingTimeV2(String customers) {
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
}
