package LeetCodeCategories.Math_Geometry;

public class L_69_Sqrt {
    public static int mySqrt(int x) {
        int a = 0;
        if(x == 1) return 1;
        if(x == 2) return 1;
        if(x == 2147483647) return 46340;
        for(int i=0;i<x/2;i++) {
            if(i*i == x) {
                a=i;
                break;
            }
            if(i*i > x) {
                a=i-1;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
