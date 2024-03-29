package utils;

public class Convertor {

    public String convert(String input) {
        return input.replace('[', '{').replace(']', '}');
    }

    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        String input = "[\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]\n" +
                "[\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]";
        System.out.println(convertor.convert(input));
    }
}
