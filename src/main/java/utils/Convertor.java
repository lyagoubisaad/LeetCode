package utils;

public class Convertor {

    public void toBracesAndSingleQuotes(String input) {
        String output = input.replace('[', '{').replace(']', '}').replace('"', '\'');
        System.out.println(output);
    }

    public void bracketsToList(String input) {
        String output = input.replaceAll("\\[", "List.of(").replaceAll("\\]", ")");
        System.out.println(output);
    }
}
