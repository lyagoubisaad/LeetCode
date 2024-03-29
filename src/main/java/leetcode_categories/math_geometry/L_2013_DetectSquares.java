package leetcode_categories.math_geometry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class L_2013_DetectSquares {
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    List<Point> store;
    HashMap<Point, Integer> occur;
    public L_2013_DetectSquares() {
        store = new ArrayList<>();
        occur = new HashMap<>();
    }

    public void add(int[] point) {
        Point point1 = new Point(point[0], point[1]);
        if(!store.contains(point1)) {
            store.add(point1);
        }
        occur.put(point1, occur.getOrDefault(point1, 0) + 1);
    }

    public int count(int[] point) {
        int tot = 0;
        for (Point p: store) {
            if(p.x != point[0] && p.y != point[1] && Math.abs(p.x-point[0]) ==  Math.abs(p.y-point[1])) {
                tot += occur.getOrDefault(new Point(p.x, point[1]), 0) * occur.getOrDefault(new Point(point[0], p.y), 0)
                * occur.get(p);
            }
        }
        return tot* occur.getOrDefault(point, 1);
    }
}
