public class FindLeastCommonAncestor2 {
    static TreeNode lca(TreeNode root,int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.key == n1 || root.key == n2){
            return root;
        }

        TreeNode lca1 = lca(root.left, n1, n2);
        TreeNode lca2 = lca(root.right, n1, n2);
        if(lca1 != null && lca2 != null){
            return root;
        }
        if(lca1 != null){
            return lca1;
        }else{
            return lca2;
        }
    }
}
