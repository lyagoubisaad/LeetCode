package LeetCodeCategories.Graphs;

import java.util.*;

public class L_127_WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i=0;i<wordList.size();i++) {
            String first = wordList.get(i);
            for (int j=i+1;j<wordList.size();j++) {
                String second = wordList.get(j);
                int cpt = 0;
                for (int k=0;k<first.length();k++) {
                    if(first.charAt(k) != second.charAt(k)) cpt++;
                    if(cpt == 2) break;
                }
                if(cpt == 1) {
                    map.computeIfAbsent(first, val-> new ArrayList<>()).add(second);
                    map.computeIfAbsent(second, val-> new ArrayList<>()).add(first);
                }
            }
        }
        for (String word : wordList) {
            int cpt = 0;
            for (int k = 0; k < beginWord.length(); k++) {
                if (beginWord.charAt(k) != word.charAt(k)) cpt++;
                if (cpt == 2) break;
            }
            if (cpt == 1) {
                map.computeIfAbsent(beginWord, val -> new ArrayList<>()).add(word);
            }
        }
        if(map.isEmpty() || !map.containsKey(beginWord)) return 0;
        return bfs(beginWord, endWord, map);
    }

    private int bfs(String beginWord, String endWord, HashMap<String, List<String>> map) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        HashSet<String> seen = new HashSet<>();
        int length = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                String curr = queue.poll();
                if(!seen.add(curr)) continue;
                if(curr.equals(endWord)) return length;
                for (String word: map.getOrDefault(curr, new ArrayList<>())) queue.offer(word);
            }
            length++;

        }
        return 0;
    }
}
