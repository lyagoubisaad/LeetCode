package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L_2196_CreateBinaryTreeFromDescriptions {
    public static TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode root = new TreeNode();
        List<TreeNode> children = new ArrayList<>();
        List<TreeNode> parents = new ArrayList<>();
        for (int i=0;i<descriptions.length;i++) {
            TreeNode parent = null;
            TreeNode child = null;
            for (TreeNode node : children) {
                if(node.val == descriptions[i][0]) parent = node;
                if(node.val == descriptions[i][1]) child = node;
            }
            if(parent == null) {
                parent = new TreeNode(descriptions[i][0]);
                parents.add(parent);
            }
            if(child == null) {
                child = new TreeNode(descriptions[i][1]);
                children.add(child);
            }
            if(descriptions[i][2] == 1) parent.left = child;
            else parent.right = child;
            for (TreeNode elem : parents) {
                if(elem.val == descriptions[i][1]) parents.remove(elem);break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        createBinaryTree(new int[][] { {85,82,1},{74,85,1},{39,70,0},{82,38,1},{74,39,0},{39,13,1}});
    }
}