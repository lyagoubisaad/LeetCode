package leetcode_categories.binary_search;

public class L_875_KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i=0;i<piles.length;i++) {
            max = Math.max(max, piles[i]);
        }
        if(piles.length == h) return max;
        int l=1;
        int r=max;
        int mid;
        while (l<=r) {
            mid = (r+l)/2;
            if(cpt(mid,piles) <= h) r=mid-1;
            else l=mid+1;
        }
        return l;
    }

    public static long cpt(int n, int[] piles) {
        long sum = 0;
        for (int i=0;i<piles.length;i++) {
            sum += calc(piles[i],n);
        }
        return sum;
    }

    public static int calc(int dividend, int divisor) {
        return (dividend + divisor - 1) / divisor;
    }

    public static void main(String[] args) {
        int[] piles = new int[] {332484035,524908576,855865114,632922376,
                222257295,690155293,112677673,679580077,337406589,290818316,
                877337160,901728858,679284947,688210097,692137887,718203285,
                629455728,941802184};
        System.out.println(minEatingSpeed(piles,8));
    }
}
