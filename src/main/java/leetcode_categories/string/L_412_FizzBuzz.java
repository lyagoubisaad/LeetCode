package leetcode_categories.string;

import java.util.ArrayList;
import java.util.List;

public class L_412_FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i=1;i<=n;i++) {
            if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(String.valueOf(i));
        }
    }

}
