package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class L_119_Pascals_TriangleII {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Result = new ArrayList<>();
        Result.add(new ArrayList(List.of(1)));
        if(numRows == 1) return Result;
        Result.add(new ArrayList(List.of(1,1)));
        if(numRows == 2) return Result;
        int k = 2;
        while (numRows > k) {
            Result.add(new ArrayList(List.of(1)));
            for(int i=1;i<Result.get(k-1).size();i++) {
                int elem = (int) Result.get(k-1).get(i-1) + (int) Result.get(k-1).get(i);
                Result.get(k).add(elem);
            }
            Result.get(k).add(1);
            k++;
        }
        return Result;
    }

    public static List<Integer> getRow(int rowIndex) {
        return generate(rowIndex+1).get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }
}
