package amazon_assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimalHeaviestSetA {

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        long totalSum = 0;
        long firstBoxSum = 0;

        List<Integer> sortedBox = new ArrayList<>(arr);
        sortedBox.sort(Collections.reverseOrder());

        for (int weight : sortedBox) {
            totalSum += weight;
        }

        List<Integer> firstBox = new ArrayList<>();
        while (totalSum >= firstBoxSum) {
            int weight = sortedBox.get(0);
            sortedBox.remove(0);
            firstBoxSum += weight;
            totalSum -= weight;
            firstBox.add(weight);
        }

        Collections.sort(firstBox);
        return firstBox;
    }
}
