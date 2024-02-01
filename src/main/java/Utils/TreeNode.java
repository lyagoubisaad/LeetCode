package Utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode formTree(Integer[] data) {
        if (data == null || data.length == 0) {
            return null; // Handle invalid input
        }
        return form(data, 0);
    }

    private static TreeNode form(Integer[] data, int index) {
        if (index >= data.length || data[index] == null) {
            return null; // Handle empty nodes
        }

        TreeNode root = new TreeNode(data[index]);
        root.left = form(data, 2 * index + 1);
        root.right = form(data, 2 * index + 2);

        return root;
    }
}

