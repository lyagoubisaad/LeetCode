package leetcode_categories.binary_search;

public class L374GuessNumberHigherOrLower {

    static int guess;

    int guess(int n) {
        if(n == guess) return 0;
        else if(guess > n) return -1;
        else return 1;
    }
    public int guessNumber(int n) {
        guess = n;
        int low = 1;
        int high = Integer.MAX_VALUE;
        int mid = low + ( high - low ) / 2;
        while (mid != n) {
            if(guess(mid) == 0) break;
            if(guess(mid) == -1) {
                low = mid;
                mid = (mid + high)/2;
            }
            if(guess(mid) == 1) {
                high = mid;
                mid = (mid + low) /2;
            }
        }
        return mid;
    }
}
