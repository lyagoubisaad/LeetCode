package leetcode_categories.dynamic_programming_2d;

public class L920NumberMusicPlaylists {
    private int[][] dpPascal = new int[101][101];

    public long comb(int n, int m) {
        return (n == 0 || m == 0) ? 1 :
                (dpPascal[n][m] != 0) ? dpPascal[n][m] :
                        (dpPascal[n][m] = (int) ((comb(n - 1, m) + comb(n, m - 1))));
    }

    public int numMusicPlaylists(int N, int L, int K) {
        if (K > N)
            return 0;
        if (N == 0 || L == 0)
            return (N == L) ? 1 : 0;

        long res = 0;
        for (int i = 0; i < L; ++i)
            res = (res + Math.max(1, res) * (N - Math.min(i, K))) % 1_000_000_007;
        for (int i = 1; i < N; ++i)
            res = (res - (comb(N - i, i) * numMusicPlaylists(i, L, K)) % 1_000_000_007) % 1_000_000_007;
        return (int) res;
    }

}
