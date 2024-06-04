package leetcode_categories.union_find;

import utils.UnionFind;

public class L1971FindPathExistsGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            unionFind.union(edge[0], edge[1]);
        }
        return unionFind.find(source) == unionFind.find(destination);
    }
}
