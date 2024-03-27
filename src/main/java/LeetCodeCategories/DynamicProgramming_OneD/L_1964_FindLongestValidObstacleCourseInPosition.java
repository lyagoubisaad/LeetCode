package LeetCodeCategories.DynamicProgramming_OneD;

public class L_1964_FindLongestValidObstacleCourseInPosition {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int[] result = new int[obstacles.length];
        for (int i=0;i<obstacles.length;i++) {
            result[i] = helper(0, i, obstacles, obstacles[i], 0);
        }
        return result;
    }

    private int helper(int idx, int i, int[] obstacles, int max, int prv) {
        if(idx == i) return 1;
        if(obstacles[i] > max || obstacles[i] < prv) return helper(idx+1, i, obstacles, max, prv);
        return Math.max(helper(idx+1, i, obstacles, max, prv), 1+helper(idx+1, i, obstacles, max, obstacles[i]));
    }
}
