public class MaximumInBinaryTree {
    int getMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }
}
