public class ChildrenSumProperty {
    
    static boolean isCSum(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null & root.right == null){
            return true;
        }

        int sum = 0;
        if(root.left != null){
            sum += root.left.key;
        }
        if(root.right != null){
            sum += root.right.key;
        }
        return (root.key == sum && isCSum(root.left) && isCSum(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(1);

        System.out.println(isCSum(root));
    }
}
