package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_1022_SumOfRootToLeafBinaryNumbers {
    public static int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        Queue<Integer> elems = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        elems.add(root.val);
        int idx = 0;
        int tot = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0;i<size;i++) {
                root = q.poll();
                int tmp = elems.poll();
                if(root.left == null && root.right == null) {
                    tot += tmp;
                }
                if(root.left != null) {
                    q.add(root.left);
                    elems.add(tmp+(2^(idx+1))*root.left.val);
                }
                if(root.right != null) {
                    q.add(root.right);
                    elems.add(tmp+(int)Math.pow(2,idx+1)*root.right.val);
                }
            }
            idx++;
        }
        return tot;
    }

    public static void main(String[] args) {
        sumRootToLeaf(new TreeNode().formTree(new Integer[] {1,0,1,0,1,0,1}));
    }
}
