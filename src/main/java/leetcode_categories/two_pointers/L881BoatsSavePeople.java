package leetcode_categories.two_pointers;

import java.util.Arrays;

public class L881BoatsSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        Arrays.sort(people);
        int numRescueBoats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            numRescueBoats++;
        }
        return numRescueBoats;
    }
}
