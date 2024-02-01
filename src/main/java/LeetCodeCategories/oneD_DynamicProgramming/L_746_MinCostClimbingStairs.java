package LeetCodeCategories.oneD_DynamicProgramming;

public class L_746_MinCostClimbingStairs {

    int[] store;
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        store = new int[length];
        for (int i=length-1;i>=0;i--) {
            if(i >= length-2) store[i] = cost[i];
            else store[i] = cost[i]+Math.min(store[i+1], store[i+2]);
        }
        return Math.min(store[0], store[1]);
    }

    public static void main(String[] args) {
        new L_746_MinCostClimbingStairs().minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1});
    }
}
