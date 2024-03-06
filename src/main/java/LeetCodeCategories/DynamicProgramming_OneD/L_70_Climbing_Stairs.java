package LeetCodeCategories.DynamicProgramming_OneD;

public class L_70_Climbing_Stairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first  = 1;
        int second = 2;
        int tmp;
        for (int i = 3; i <= n; i++) {
            tmp = second;
            second = first + second;
            first = tmp;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(new L_70_Climbing_Stairs().climbStairs(4));
    }
}
