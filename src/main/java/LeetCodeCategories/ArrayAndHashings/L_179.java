package LeetCodeCategories.ArrayAndHashings;

public class L_179 {
    public static String largestNumber(int[] nums) {
        for (int j=1;j<nums.length;j++) {
            for (int i=0;i<j;i++) {
                if(!compare(nums[i], nums[j])) {
                    nums[i] = nums[i]^nums[j];
                    nums[j] = nums[i]^nums[j];
                    nums[i] = nums[i]^nums[j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<nums.length;i++) {
            sb.append(nums[i]);
        }
        if(sb.toString().charAt(0) == '0') return "0";
        return sb.toString();
    }
    private static boolean compare(long a, long b) {
        String a1 = String.valueOf(a);
        a1 += String.valueOf(b);
        String b1 = String.valueOf(b);
        b1 += String.valueOf(a);
        for (int i=0;i<a1.length();i++) {
            if((a1.charAt(i) - '0') >  (b1.charAt(i) - '0')) return true;
            else if((a1.charAt(i) - '0') <  (b1.charAt(i) - '0')) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        largestNumber(new int[] {1000000000, 1000000000});
    }
}
