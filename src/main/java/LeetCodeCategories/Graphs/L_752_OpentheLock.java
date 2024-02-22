package LeetCodeCategories.Graphs;

import java.util.*;

public class L_752_OpentheLock {
    public int openLock(String[] deadends, String target) {
        if(target.equals("0000")) return 0;
        Queue<StringBuilder> queue = new ArrayDeque<>();
        queue.add(new StringBuilder("0000"));
        Set<String> visited = new HashSet<>();
        HashMap<String, Integer> moves = new HashMap<>();
        String firstElem = queue.peek()+"";
        visited.add(firstElem);
        for (int i=0;i<deadends.length;i++) {
            if(Objects.equals(deadends[i], "0000")) return -1;
            visited.add(deadends[i]);
        }
        moves.put(firstElem, 0);
        while (!queue.isEmpty()) {
            StringBuilder current = queue.poll();
            List<String> comb = generateComb(current);
            for (String elem: comb) {
                if(visited.add(elem)) {
                    queue.add(new StringBuilder(elem));
                    if(elem.equals(target)) return moves.get(current+"")+1;
                    moves.put(elem, moves.get(current+"")+1);
                }
            }
        }
        return -1;
    }
    private List<String> generateComb(StringBuilder current) {
        List<String> result = new ArrayList<>();
        for (int i=0;i<4;i++) {
            int nbr = Integer.parseInt(current.charAt(i)+"");
            int[] comb = new int[2];
            comb[0] = nbr-1 == -1 ? 9: nbr-1;
            comb[1] = nbr+1 == 10 ? 0: nbr+1;
            for (int j=0;j<2;j++) {
                StringBuilder tmp = new StringBuilder(current);
                result.add(tmp.replace(i,i+1,comb[j]+"")+"");
            }
        }
        return result;
    }
}
