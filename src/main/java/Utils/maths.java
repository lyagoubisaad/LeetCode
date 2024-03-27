package Utils;

public class maths {

    public static int gcd(int num1, int num2) {
        if(num2 == num1) return num1;
        else if(num1 > num2) return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }
}
