package leetcode_categories.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_735 {
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stk.add(asteroids[i]);
            } else {
                if(stk.isEmpty()) list.add(asteroids[i]);
                while (!stk.isEmpty()) {
                    int element = stk.peek();
                    if (Math.abs(asteroids[i]) == element) {
                        stk.pop();
                        break;
                    }
                    if (Math.abs(asteroids[i]) < element) {
                        break;
                    }
                    if(Math.abs(asteroids[i]) > element) {
                        stk.pop();
                        if(stk.isEmpty()) list.add(asteroids[i]);
                    }
                }
            }
        }
        Stack<Integer> reverseStk = new Stack<>();
        while (!stk.isEmpty()) {
            reverseStk.add(stk.pop());
        }
        int[] res = new int[list.size()+reverseStk.size()];
        for (int i=0;i<list.size();i++) {
            res[i] = list.get(i);
        }
        int i=list.size();
        while (!reverseStk.isEmpty()) {
            res[i++] = reverseStk.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        asteroidCollision(new int[]{-2,1,1,-1});
    }
}
