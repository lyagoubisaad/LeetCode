package LeetCodeCategories.BitManipulation;

public class L_67_AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >=0 || carry > 0) {
            carry += i >= 0 ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;
            carry += j >= 0 ?Integer.parseInt(String.valueOf(b.charAt(j))) : 0;
            i--;
            j--;
            if(carry < 2) {
                sb.insert(0, carry);
                carry = 0;
            } else {
                carry -= 2;
                sb.insert(0, carry);
                carry = 1;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
    }
}
