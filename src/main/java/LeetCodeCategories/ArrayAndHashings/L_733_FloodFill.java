package LeetCodeCategories.ArrayAndHashings;

public class L_733_FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        if(value == color) return image;
        image[sr][sc] = color;
        if(sr+1 < image.length) {
            if(image[sr+1][sc] == value) {
                floodFill(image,sr+1,sc,color);
            }
        }
        if(sr-1 >= 0) {
            if(image[sr-1][sc] == value) {
                floodFill(image,sr-1,sc,color);
            }
        }
        if(sc-1 >= 0) {
            if(image[sr][sc-1] == value) {
                floodFill(image,sr,sc-1,color);
            }
        }
        if(sc+1 < image[0].length) {
            if(image[sr][sc+1] == value) {
                floodFill(image,sr,sc+1,color);
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] tmp = new int[3][3];
        tmp[0][0] = 1;
        tmp[0][1] = 1;
        tmp[0][2] = 1;
        tmp[1][0] = 1;
        tmp[1][1] = 1;
        tmp[1][2] = 0;
        tmp[2][0] = 1;
        tmp[2][1] = 0;
        tmp[2][2] = 1;
        floodFill(tmp,1,1,2);
    }
}
