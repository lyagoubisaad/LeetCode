package diabolocom_assesment;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GetGreaterThanNumber {
    public TreeNode greaterThanNumber(TreeNode root, int number) {
        if(number >= root.val) {
            if(root.right == null) return null;
            else return greaterThanNumber(root.right, number);
        } else {
            if(root.left == null || root.left.val < number) return root;
            return greaterThanNumber(root.left, number);
        }
    }

    public List<Integer> getKgreaterThanNumber(TreeNode root, int k, int number) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if(k == 0) break;
            if(root != null) {
                if(root.val > number) {
                    stack.add(root);
                }
                root = root.left;
            } else {
                root = stack.pop();
                if(root.val > number) {
                    result.add(root.val);
                    k--;
                }
                root = root.right;
            }
        }
        return result;
    }

    //n == 0 and k 100

    //2 5 7 10 12 15 17

}
