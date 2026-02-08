package codingpractice.trees;

class Solution {

    static int heightCheck(TreeNode root){
        if(root==null) return 0;

        int left = heightCheck(root.left);
        int right = heightCheck(root.right);
        
        if(left==-1 || right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return 1 + Math.max(left, right);
    }

    public static boolean isBalanced(TreeNode root) {
        int ans = heightCheck(root);

        return ans==-1 ? false : true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        boolean isBalancedTree = Solution.isBalanced(root);
        System.out.println(isBalancedTree);
    }
}