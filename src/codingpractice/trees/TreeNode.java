package codingpractice.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    int data;
    List<TreeNode> children;

    TreeNode(int x) {
        data = x;
        children = new ArrayList<>();
    }

}
