package LeetCodeCategories.Math_Geometry;

public class L_258_Add_Digits {
    public static int addDigits(int num) {
        if(num < 10) return num;
        int cpt =0;
        String[] s = String.valueOf(num).split("");
        for (int i=0;i<s.length;i++) {
            cpt += Integer.valueOf(s[i]);
        }
        if(cpt >= 10) {
            cpt = addDigits(cpt);
        }
        return cpt;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
