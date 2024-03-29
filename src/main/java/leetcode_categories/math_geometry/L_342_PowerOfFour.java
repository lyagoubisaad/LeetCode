package leetcode_categories.math_geometry;

public class L_342_PowerOfFour {
    public boolean isPowerOfFour(int n) {
        while (n>0) {
            if(n == 1) return true;
            if(n%4 != 0 ) return false;
            n = n/4;
         }
        return false;
    }

}
