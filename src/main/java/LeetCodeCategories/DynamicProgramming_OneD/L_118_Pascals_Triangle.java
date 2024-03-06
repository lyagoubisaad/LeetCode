package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayList;
import java.util.List;

public class L_118_Pascals_Triangle {
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

    public static void main(String[] args) {
        List<List<Integer>> Result = generate(3);
        for(int i=2;i<Result.size();i++) {
            System.out.println("New line");
            for(int j=0;j<Result.get(i).size();j++) {
                System.out.println(Result.get(i).get(j));
            }
        }
    }

}
