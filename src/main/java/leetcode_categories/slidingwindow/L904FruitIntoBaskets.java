package leetcode_categories.slidingwindow;

public class L904FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int first = 0;
        int second = 1;
        int max = Math.min(fruits.length, 2);
        if(fruits.length < 3) return max;
        for (int i=2;i<fruits.length;i++) {
            if(fruits[i] != fruits[first] && fruits[i] != fruits[second]) {
                second = i;
                first = i;
                while (first > 0 && fruits[first] == fruits[i]) first--;
                while (first > 0 && (fruits[first-1] == fruits[first] || fruits[first-1] == fruits[second])) first--;
            }
            max = Math.max(max, i-first+1);
        }
        return max;
    }
}
