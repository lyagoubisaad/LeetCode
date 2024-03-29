package utils;

public class Convertor {

    public void convert(String input) {
        String output = input.replace('[', '{').replace(']', '}');
        System.out.println(output);
    }
}
