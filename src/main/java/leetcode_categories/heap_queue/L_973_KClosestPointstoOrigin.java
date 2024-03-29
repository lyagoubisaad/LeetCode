package leetcode_categories.heap_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L_973_KClosestPointstoOrigin {

    class Point{
        double value;
        int x;
        int y;

        Point(double value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }

        public double getValue() {
            return this.value;
        }
    }

    Comparator<Point> pointComparator = Comparator.comparingDouble(Point::getValue);
    PriorityQueue<Point> heap = new PriorityQueue<>(pointComparator);

    int k;
    public int[][] kClosest(int[][] points, int k) {
        this.k = k;
        int[][] result;
        for (int i=0;i<points.length;i++) {
            double value = Math.sqrt(Math.pow(points[i][0],2) + Math.pow(points[i][1],2));
            add(new Point(-value, points[i][0], points[i][1]));
        }
        result = new int[k][2];
        for (int i=0;i<k;i++) {
            result[i][0] = heap.peek().x;
            result[i][1] = heap.poll().y;
        }
        return result;
    }

    public void add(Point point) {
        heap.offer(point);
        if(heap.size() > k) heap.poll();
    }

    public static void main(String[] args) {
        int[][] points = new int[][] {{3,3},{5,-1}, {-2,4}};
        new L_973_KClosestPointstoOrigin().kClosest(points,2);
    }
}
