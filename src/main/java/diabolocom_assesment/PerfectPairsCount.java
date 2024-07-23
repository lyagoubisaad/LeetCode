package diabolocom_assesment;

import java.util.Collections;
import java.util.List;

public class PerfectPairsCount {
    public int getPerfectPairsCount(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();
        int count = 0;
        int[] absValues = new int[n];
        for (int i = 0; i < n; i++) {
            absValues[i] = Math.abs(arr.get(i));
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = arr.get(i);
                int y = arr.get(j);
                int absX = absValues[i];
                int absY = absValues[j];
                boolean condition1 = Math.min(Math.abs(x - y), Math.abs(x + y)) <= Math.min(absX, absY);
                boolean condition2 = Math.max(Math.abs(x - y), Math.abs(x + y)) >= Math.max(absX, absY);
                if (condition1 && condition2) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
