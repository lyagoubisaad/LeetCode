package LeetCodeCategories.ArrayAndHashings;

public class L_2405_OptimalPartitionofString {
    public static int partitionString(String s) {
        int tot=0;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if(sb.toString().contains(s.charAt(i) + "")) {
                tot++;
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return tot;
    }

    public static void main(String[] args) {
        partitionString("abacaba");
    }
}
