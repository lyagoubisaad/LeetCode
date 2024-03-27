package amazonAssesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class handleRequests {
    public static List<Integer> findRequestsInQueue(List<Integer> wait) {
        int[] dp = new int[wait.size()];
        Map<Integer, Integer> store = new HashMap<>();
        for (int i=0;i<wait.size();i++) {
            System.out.println("idx: " + i + "value : " + wait.get(i));
        }

        for (int i = 0; i < wait.size(); i++) {
            dp[i] = Math.min(i + 1, wait.get(i));
            store.put(dp[i], store.getOrDefault(dp[i], 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        result.add(wait.size());
        for (int i = 1; i < store.size()+1; i++) {
            result.add(i, result.get(i - 1) - store.getOrDefault(i, 0));
            if (result.get(i) == 0) break;
        }
        return result;
    }
}
