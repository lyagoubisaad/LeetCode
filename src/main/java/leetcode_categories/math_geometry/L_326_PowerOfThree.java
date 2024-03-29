package leetcode_categories.math_geometry;

public class L_326_PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        while (n > 0) {
            if(n == 1) return true;
            if(n%3 != 0) return false;
            n = n / 3;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
