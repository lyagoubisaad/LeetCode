package leetcode_categories.stack;

import java.util.Arrays;
import java.util.Stack;

public class L_739_DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result,0);
        Stack<Integer> stkValues = new Stack<>();
        Stack<Integer> stkIdx = new Stack<>();
        for (int i=temperatures.length-1;i>=0;i--) {
            while (!stkValues.isEmpty()) {
                if(stkValues.peek() <= temperatures[i]) {
                    stkValues.pop();
                    stkIdx.pop();
                } else {
                    stkValues.push(temperatures[i]);
                    result[i] = stkIdx.peek()-i;
                    stkIdx.push(i);
                    break;
                }
            }
            if(stkValues.isEmpty()) {
                stkValues.push(temperatures[i]);
                stkIdx.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
    }
}