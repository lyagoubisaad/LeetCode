package LeetCodeCategories.Math_Geometry;

public class L_50_Pow {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1 || x==1) return x;
        if(n<0) {
            if(n==Integer.MIN_VALUE) return myPow(1/x, Integer.MAX_VALUE);
            return myPow(1/x, -n);
        }
        double nbr = x;
        for (int i=1;i<n;i++) {
            nbr *= x;
        }
        return nbr;
    }

    public static void main(String[] args) {
        new L_50_Pow().myPow(2.00000, -2147483648);
    }
}
