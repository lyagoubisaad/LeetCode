package leetcode_categories.string;

import java.util.ArrayList;
import java.util.List;

public class L_412_FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList();
        for (int i=1;i<=n;i++) {
            if(i%3==0 && i%5==0) ret.add("FizzBuzz");
            else if(i%3==0) ret.add("Fizz");
            else if(i%5==0) ret.add("Buzz");
            else ret.add(String.valueOf(i));
        }
        for (String s : ret) {
            System.out.println(s);
        }
        return ret;
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }

}
