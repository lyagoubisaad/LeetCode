package LeetCodeCategories.BitManipulation;

public class L_338_CountingBits {
    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        int count = 0;
        int milestone = 0;
        for (int i=1;i<n;i++) {
            if(count == 0) {
                res[i] = 1;
                count = i-1;
                milestone = i;
            }
            else {
                res[i] = res[milestone] + res[milestone-count];
                count--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        countBits(8);
    }
}
