package leetcode_categories.greedy;

public class L_1423_MaximumPointsYouCanObtainfromCards {
    public static int maxScore(int[] cardPoints, int k) {
        if(k >= cardPoints.length) {
            int sum = 0;
            for (int num: cardPoints) {
                sum += num;
            }
            return sum;
        }
        int sum = 0;
        for (int i=cardPoints.length-1;i>=cardPoints.length-k;i--) {
            sum += cardPoints[i];
        }
        int max = sum;
        int windowSize = cardPoints.length-k;
        int start = 0;
        while (windowSize<cardPoints.length) {
            sum += cardPoints[start++];
            sum -= cardPoints[windowSize++];
            max = Math.max(max, sum);
        }
        return max;
    }
}
