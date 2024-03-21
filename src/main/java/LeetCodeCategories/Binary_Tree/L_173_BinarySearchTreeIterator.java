package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_173_BinarySearchTreeIterator {

    class BSTIterator {

        List<Integer> list = new ArrayList<>();
        int cpt = 0;
        public BSTIterator(TreeNode root) {
            list = inOrder(root);
        }

        public int next() {
            return list.get(cpt++);
        }

        public boolean hasNext() {
            return cpt<list.size();
        }

        private List<Integer> inOrder(TreeNode root) {
            Stack<TreeNode> stk = new Stack<>();
            List<Integer> list = new ArrayList<>();
            while (root != null || !stk.isEmpty()) {
                while (root != null) {
                    stk.add(root);
                    root = root.left;
                }
                root = stk.pop();
                list.add(root.val);
                root = root.right;
            }
            return list;
        }
    }
}
