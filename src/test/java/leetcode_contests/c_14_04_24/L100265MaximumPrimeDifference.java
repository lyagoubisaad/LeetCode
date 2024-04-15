package leetcode_contests.c_14_04_24;

public class L100265MaximumPrimeDifference {
    public int maximumPrimeDifference(int[] nums) {
        int first = -1;
        int second = -1;
        for (int i=0;i<nums.length;i++) {
            if(isPrime(nums[i])) {
                if(first == -1) first = i;
                else second = i;
            }
        }
        if(second == -1) return 0;
        return second-first;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
