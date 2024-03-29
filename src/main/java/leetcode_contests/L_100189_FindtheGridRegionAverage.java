package leetcode_contests;

public class L_100189_FindtheGridRegionAverage {
    public static int[][] resultGrid(int[][] image, int threshold) {
        int m = image.length;
        int n = image[0].length;
        int[][] result = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int sum = 0;
                    int count = 0;
                    dfs(image, i, j, threshold, visited, sum, count);
                }
            }
        }

        return result;
    }

    private static void dfs(int[][] image, int i, int j, int threshold, boolean[][] visited, int sum, int count) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        sum += image[i][j];
        count++;

        if (count == 9) {
            int average = sum / count;
            populateResult(image, i, j, threshold, visited, average);
        }

        int intensity = image[i][j];

        if (i > 0 && Math.abs(image[i - 1][j] - intensity) <= threshold) {
            dfs(image, i - 1, j, threshold, visited, sum, count);
        }
        if (i < image.length - 1 && Math.abs(image[i + 1][j] - intensity) <= threshold) {
            dfs(image, i + 1, j, threshold, visited, sum, count);
        }
        if (j > 0 && Math.abs(image[i][j - 1] - intensity) <= threshold) {
            dfs(image, i, j - 1, threshold, visited, sum, count);
        }
        if (j < image[0].length - 1 && Math.abs(image[i][j + 1] - intensity) <= threshold) {
            dfs(image, i, j + 1, threshold, visited, sum, count);
        }
    }

    private static void populateResult(int[][] image, int i, int j, int threshold, boolean[][] visited, int average) {
        if (i > 0 && !visited[i - 1][j] && Math.abs(image[i - 1][j] - average) <= threshold) {
            populateResult(image, i - 1, j, threshold, visited, average);
        }
        if (i < image.length - 1 && !visited[i + 1][j] && Math.abs(image[i + 1][j] - average) <= threshold) {
            populateResult(image, i + 1, j, threshold, visited, average);
        }
        if (j > 0 && !visited[i][j - 1] && Math.abs(image[i][j - 1] - average) <= threshold) {
            populateResult(image, i, j - 1, threshold, visited, average);
        }
        if (j < image[0].length - 1 && !visited[i][j + 1] && Math.abs(image[i][j + 1] - average) <= threshold) {
            populateResult(image, i, j + 1, threshold, visited, average);
        }

        visited[i][j] = true;
        image[i][j] = average;
    }
}

