package leetcode_categories.math_geometry;

public class L_263_Ugly_Number {
    public static boolean isUgly(int n) {
        if(n==0) return false;
        while (n%3==0) {
            n = n/3;
        }
        while (n%2==0) {
            n = n/2;
        }
        while (n%5==0) {
            n = n/5;
        }
        if(n==1) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
}
