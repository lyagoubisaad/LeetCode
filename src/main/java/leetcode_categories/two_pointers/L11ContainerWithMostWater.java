package leetcode_categories.two_pointers;

public class L11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxL=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            maxL=Math.max(maxL,h*(j-i));
            while(i<j && height[i]<=h){
                i++;
            }
            while(i<j && height[j]<=h){
                j--;
            }
        }
        return maxL;
    }
}
