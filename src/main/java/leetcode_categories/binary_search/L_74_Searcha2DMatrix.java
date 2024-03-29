package leetcode_categories.binary_search;

import java.util.Arrays;

public class L_74_Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] store = new int[m*n];
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                store[i*(n) +j] = matrix[i][j];
            }
        }

        return find(store, target);
    }
    public static boolean find(int[] array, int target) {
        if(array.length == 0) return false;
        if(array.length == 1 && array[0] != target) return false;
        if(array[array.length/2] == target) return true;
        if(array[array.length/2] > target) {
            if(array[(array.length/2)-1] < target) return false;
            if(array[(array.length/2)-1] == target) return true;
            if(array[(array.length/2)-1] > target) {
                return find(Arrays.copyOfRange(array,0,(array.length/2)-1),target);
            }
        }
        if(array[array.length/2] < target) {
            if(array[(array.length/2)] > target) return false;
            if(array[(array.length/2)] < target) {
                return find(Arrays.copyOfRange(array,(array.length/2)+1,array.length),target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][] {{1,1}};
        int target = 2;
        System.out.println(searchMatrix(matrix, target));
    }
}
