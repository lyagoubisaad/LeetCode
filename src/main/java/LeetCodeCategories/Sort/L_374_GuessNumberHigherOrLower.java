package LeetCodeCategories.Sort;

public class L_374_GuessNumberHigherOrLower {

    static int guess;

    static int guess(int n) {
        if(n == guess) return 0;
        else if(guess > n) return -1;
        else return 1;
    }
    public static int guessNumber(int n) {
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

    public static void main(String[] args) {
        System.out.println(guessNumber(6));
    }
}
