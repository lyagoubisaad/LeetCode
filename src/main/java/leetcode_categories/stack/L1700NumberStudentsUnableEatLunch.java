package leetcode_categories.stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class L1700NumberStudentsUnableEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int k : students) {
            queue.add(k);
        }
        Stack<Integer> stk = new Stack<>();
        for (int j=sandwiches.length-1;j>=0;j--) {
            stk.add(sandwiches[j]);
        }
        int cpt = 0;
        while (!stk.isEmpty() && cpt < queue.size()) {
            int student = queue.poll();
            if(student == stk.peek()) {
                stk.pop();
                cpt = 0;
            }
            else {
                cpt++;
                queue.add(student);
            }
        }
        return queue.size();
    }
}
