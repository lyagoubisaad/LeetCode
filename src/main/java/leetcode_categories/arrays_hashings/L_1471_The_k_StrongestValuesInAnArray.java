package leetcode_categories.arrays_hashings;

public class L_1471_The_k_StrongestValuesInAnArray {
    public static int[] getStrongest(int[] arr, int k) {
        int tmp = 0;
        for (int elem : arr) {
            tmp += elem;
        }
        tmp = tmp/arr.length;
        for (int elem : arr) {
            System.out.println(elem);
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(getStrongest(new int[] {1,2,3,4,5}, 2));
    }
}
