package LeetCodeCategories.Heap_Queue;

import java.util.HashMap;
import java.util.Map;

public class L_621_TaskScheduler {
    int n;
    HashMap<Character, Integer> timerStore = new HashMap<>();
    public int leastInterval(char[] tasks, int n) {
        this.n = n;
        int timer = 0;
        HashMap<Character, Integer> store = new HashMap<>();
        for (int i=0;i<tasks.length;i++) {
            store.put(tasks[i], store.getOrDefault(tasks[i], 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : store.entrySet()) {
            timerStore.put(entry.getKey(), 0);
        }
        while (!store.isEmpty()) {
            Character elementOfTask = null;
            int maxValue = Integer.MIN_VALUE;
            for (Map.Entry<Character, Integer> entry : store.entrySet()) {
                if(getTimer(entry.getKey()) == 0 && store.get(entry.getKey()) > maxValue) {
                        elementOfTask = entry.getKey();
                        maxValue = store.get(entry.getKey());
                }
            }
            if(elementOfTask != null) {
                store.put(elementOfTask, store.get(elementOfTask)-1);
                if(store.get(elementOfTask) == 0) store.remove(elementOfTask);
            }
            resetTimer(elementOfTask);
            timer++;
        }
        return timer;
    }
        public int getTimer(Character c) {
        return timerStore.get(c);
    }

    public void setTimer(Character c) {
        timerStore.put(c, n);
    }

    public void resetTimer(Character c) {
        for (Map.Entry<Character, Integer> entry : timerStore.entrySet()) {
            Character character = entry.getKey();
            if(c != null && character == c) {
                setTimer(c);
            } else {
                if(timerStore.get(character) != 0) timerStore.put(character, timerStore.get(character)-1);
            }
        }
    }

    public static void main(String[] args) {
        char[] tasks = new char[] {'A','A','A','A','A','A','B','C','D','E','F','G'};
        new L_621_TaskScheduler().leastInterval(tasks, 2);
    }
}
