package LeetCodeCategories.BitManipulation;

public class L_191_Numberof1Bits {

    //create a mask, shift the 1 everynow and one; if the
    public static int hammingWeight(int n) {

        int mask = 1;
        int cpt = 0;
        for (int i=0;i<32;i++) {
            int result = n & mask;
            if(result == mask) cpt++;
            mask = mask << 1;
        }
        return cpt;
    }

    public static void main(String[] args) {
        hammingWeight(10000000);
    }
}
