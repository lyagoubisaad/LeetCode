package leetcode_categories.bit_manipulation;

public class L_7_ReverseInteger {
    public static int reverse(int x) {
        boolean neg = false;
        if(x <0) {
            neg = true;
            x = Math.abs(x);
        }
        int result = 0;
        int length = String.valueOf(x).length();
        for (int i=0;i<length;i++) {
            int elem = x%10;
            result += elem * Math.pow(10,length-i-1);
            x /= 10;
        }
        if(result == Math.pow(2,31)-1 || result == -Math.pow(2,31)) return 0;
        return neg ? -result : result;
    }

    public static void main(String[] args) {
        reverse(-2147483648);
    }
}
