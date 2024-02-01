package LeetCodeCategories.ArrayAndHashings;

public class L_744_FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(letters[mid]-target == 1) {
                return letters[mid];
            }
            if(letters[mid]-target < 1) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return letters[left];
    }
}
