package LeetCodeCategories.TwoPointers;

import java.util.Arrays;

public class L_881_BoatstoSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=people.length-1;
        int i=0;
        int result = people.length;
        while (i<j) {
            if(people[j]+people[i] <= limit) {
                i++;
                result--;
            }
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        numRescueBoats(new int[] {3,2,2,1}, 3);
    }
}
