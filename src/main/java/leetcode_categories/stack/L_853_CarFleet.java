package leetcode_categories.stack;

import java.util.Arrays;
import java.util.Stack;

public class L_853_CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        Integer[] indices = new Integer[position.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Step 2: Sort the indices array based on the position array in reverse order
        Arrays.sort(indices, (a, b) -> Integer.compare(position[b], position[a]));

        // Step 3: Create a copy of the original position and speed arrays
        int[] newPosition = Arrays.copyOf(position, position.length);
        int[] newSpeed = Arrays.copyOf(speed, speed.length);

        // Step 4: Update the position and speed arrays based on the sorted indices
        for (int i = 0; i < indices.length; i++) {
            position[i] = newPosition[indices[i]];
            speed[i] = newSpeed[indices[i]];
        }
        Stack<Double> stk = new Stack<>();
        stk.push(calc(target - position[0], speed[0]));
        for (int i = 1; i < position.length; i++) {
            Double currentTime = calc(target - position[i], speed[i]);
            if (currentTime > stk.peek()) {
                stk.push(currentTime);
            }
        }
        return stk.size();
    }

    public static double calc(int dividend, int divisor) {
        return (double) (dividend + divisor ) / divisor;
    }

    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }
}
