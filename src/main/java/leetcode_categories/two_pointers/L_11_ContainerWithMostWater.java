package leetcode_categories.two_pointers;

public class L_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while (l<r) {
            maxArea = Math.max(maxArea, (r-l) * Math.min(height[l], height[r]));
            if(height[l] < height[r]) l++;
            else if(height[r] < height[l]) r--;
            else {
                if(height[l+1] < height[r-1]) l++;
                else r--;
            }
        }
        return maxArea;
    }
}
