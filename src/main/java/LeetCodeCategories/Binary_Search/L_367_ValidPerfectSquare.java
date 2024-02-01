package LeetCodeCategories.Binary_Search;

public class L_367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        //TODO
        if(num==0) return false;
        if(num==1) return true;
        int i=num/2;
        int mid = i * i;
        if(mid > num) {

        } else {

        }
        while (i*i <= num) {
            if(num == i*i) return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(8));
    }
}
