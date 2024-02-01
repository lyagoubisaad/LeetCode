package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.Stack;

public class L_1335_MinimumDifficultyOfAJobSchedule {
    //TODO
    public int minDifficulty(int[] jobDifficulty, int d) {
        Stack stk = new Stack();
        if(d>jobDifficulty.length) return -1;
        for(int i=0;i<jobDifficulty.length;i++) {
            if(stk.isEmpty()) {
                stk.push(jobDifficulty[i]);
            }
            if((int) stk.get(0) < jobDifficulty[i]) {
                stk.push(jobDifficulty[i]);
            }
        }
        return 0;
    }
}
