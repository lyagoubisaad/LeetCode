package leetcode_categories.math_geometry;

public class L_231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if(n==0) {
            return false;
        }
        while(n%2==0) {
            n = n/2;
        }
        if(n==1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
    }
}
