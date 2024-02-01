package LeetCodeCategories.Greedy;

public class L_134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int sum = 0;
        for (int i=0;i<gas.length;i++) {
            tank += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(tank < 0) {
                start = i+1;
                tank = 0;
            }
        }
        if(sum < 0) return -1;
        return start;
    }
    public static void main(String[] args) {
        System.out.println(new L_134_GasStation().canCompleteCircuit(new int[] {5,8,2,8}, new int[] {6,5,6,6}));
    }
}
