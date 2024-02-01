package LeetCodeCategories.ArrayAndHashings;

public class L_941_ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean inc = true;
        int height = arr[0];
        if(arr.length < 3) return false;
        if(arr[1] < arr[0]) return false;
        for (int i=1;i<arr.length;i++) {
            if(arr[i] == arr[i-1]) return false;
            if(inc) {
                if(arr[i] < height) {
                    inc = false;
                } else {
                    height = arr[i];
                }
            } else {
                if(arr[i] >= height || arr[i] >= arr[i-1]) {
                    return false;
                }
            }
        }
        return !inc;
    }

    public static void main(String[] args) {

    }
}
