package LeetCodeCategories.slidingWindow;

public class L_904 {
    public static int totalFruit(int[] fruits) {
        int b = -1;
        int l = 0;
        int r = l + 1;
        int max = 0;
        while (r < fruits.length) {
            if (fruits[r] != fruits[l]) {
                if (b == -1) {
                    b = r;
                } else if(fruits[b] != fruits[r]){
                    l = b;
                    b = -1;
                    r = l;
                }
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4});
    }
}
