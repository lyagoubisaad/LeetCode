package LeetCodeCategories.TwoPointers;

public class L_11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length-1;
        while (l<r) {
            maxArea = Math.max(maxArea, (r-l)*Math.min(height[l],height[r]));
            if(height[l] > height[r]) {
                r--;
            } else if(height[l] < height[r]) {
                l++;
            } else if(height[l] == height[r]) {
                if(height[l+1] > height[r-1]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }
}
