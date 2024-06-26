package leetcode_categories.dynamic_programming_1d;

public class L_1359_CountValidPickupDeliveryOptions {
    public int countOrders(int n) {
        long res = 1;
        long mod = (long) 1e9 + 7;
        for (int i=1;i<=n;i++) {
            res = res * (i * 2 - 1) * i % mod;
        }
        return (int) res;
    }
}
