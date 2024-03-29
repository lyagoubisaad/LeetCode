package leetcode_categories.bit_manipulation;

public class L_190_ReverseBits {
    public static int reverseBits(int n) {
        int nbr = 0;
        int mask = 1;
        int escalator = 1;
        mask = mask << 5;
        for (int i=0;i<32;i++) {
            int res = n & mask;
            if(res == mask) nbr = escalator | nbr;
            mask = mask >> 1;
            escalator = escalator << 1;
        }
        return nbr;
    }

    public static void main(String[] args) {
        reverseBits(000111);
        /*
        2 10
        4 100
        8 1000
        16 10000
         */
    }
}
