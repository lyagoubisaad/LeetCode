package LeetCodeCategories.TwoPointers;

public class L_42_TrappingRainWater {
    public static int trap(int[] height) {
        int sum = 0;
        for (int i=0;i<height.length-1;i++) {
            int j=i+1;
            int tmp = 0;
            int max = Integer.MIN_VALUE;
            while (j<height.length && height[j] < height[i])  {
                tmp += height[i]-height[j];
                max = Math.max(max, height[j]);
                j++;
            }
            if(j == height.length) {
                height[i] = max;
                i--;
                continue;
            }
            sum += tmp;
            i = j-1;
        }
        return sum;
    }

    public static void main(String[] args) {
        trap(new int[] {4,2,3});
    }
}
