package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L2037MinimumNumberMovesSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int minMovesToSeat = 0;
        for (int i=0;i<seats.length;i++) {
            minMovesToSeat += Math.abs(seats[i]-students[i]);
        }
        return minMovesToSeat;
    }
}
