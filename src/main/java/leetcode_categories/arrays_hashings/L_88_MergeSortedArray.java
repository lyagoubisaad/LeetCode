package leetcode_categories.arrays_hashings;

public class L_88_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] fnl = new int[n+m];
        int m1 = 0;
        int n1 = 0;
        int pas = 0;
        while (n>n1 && m>m1) {
            if(nums1[m1] < nums2[n1]) {
                fnl[pas] = nums1[m1];
                pas++;
                m1++;
            } else {
                fnl[pas] = nums2[n1];
                pas++;
                n1++;
            }

        }
        if(n1<n) {
            for(int i=n1;i<n;i++) {
                fnl[pas] = nums2[i];
                pas++;
            }
        }
        if(m1<m) {
            for(int i=m1;i<m;i++) {
                fnl[pas] = nums1[i];
                pas++;
            }
        }
        for(int i=0;i<nums1.length;i++) {
            nums1[i] = fnl[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);
        for (int i=0;i<nums1.length;i++) {
            System.out.println(nums1[i]);
        }

    }
}
