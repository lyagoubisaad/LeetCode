package leetcode_contests.c_31_03_24;

public class L_100263_HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int divider = reduceToOneDigit(x);
        return x%divider == 0 ? divider: -1;
    }

    public int reduceToOneDigit(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
