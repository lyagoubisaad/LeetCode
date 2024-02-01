package LeetCodeCategories.BitManipulation;

public class L_371_SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        return getSum(a^b, (a&b) <<1);
    }

    public static int getSumNonRec(int a, int b) {
        while (b !=0) {
            int carry = (a&b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(-8,-7));
    }
}
