package LeetCodeCategories.Stack;

public class L_2390 {
    public static String removeStars(String s) {
        int i=0,j=0;
        char[] sArray = s.toCharArray();
        for(i=0;i<sArray.length;i++){
            if(sArray[i]=='*'){
                j--;
            }else{
                sArray[j++] = sArray[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k=0;k<j;k++) {
            sb.append(sArray[k]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        removeStars("erase*****ea");
    }
}
