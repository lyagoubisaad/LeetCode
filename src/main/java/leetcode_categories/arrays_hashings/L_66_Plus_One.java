package leetcode_categories.arrays_hashings;

public class L_66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int add = 1;
        for(int i=digits.length-1;i>=0;i--) {
            digits[i] = digits[i] + add;
            add = 0;
            if(digits[i] == 10) {
                digits[i] = 0;
                add = 1;
            }
        }
        if(add == 1) {
            int[] tmp = new int[digits.length+1];
            tmp[0] = 1;
            for(int i=1;i<tmp.length;i++) {
                tmp[i] = digits[i-1];
            }
            return tmp;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] tmp = new int[]{9};
        plusOne(tmp);
    }
}
