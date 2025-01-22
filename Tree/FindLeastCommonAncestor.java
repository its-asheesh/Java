import java.util.ArrayList;


public class FindLeastCommonAncestor {
    static boolean findPath(TreeNode root, ArrayList<TreeNode> p,int n){
        if(root == null){
            return false;
        }
        p.add(root);
        if(root.key == n){
            return true;
        }
        if(findPath(root.left, p, n) || findPath(root.right, p, n)){
            return true;
        }
        p.remove(p.size()-1);
        return false;
    }
    static TreeNode lca(TreeNode root, int n1, int n2){
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        if(findPath(root, path1, n1) == false || findPath(root, path2, n2) == false){
            return null;
        }
        for (int i = 0; i < path1.size()-1 && i< path2.size(); i++) {
            if(path1.get(i+1) != path2.get(i+1)){
                return path1.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create the tree structure
        TreeNode root = new TreeNode(10);

        // Level 1
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);

        // Level 2
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);

        // Level 3
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(9);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(18);
        root.right.right.left = new TreeNode(22);
        root.right.right.right = new TreeNode(30);
        int n1 = 7;
        int n2 = 9;

        TreeNode lca = lca(root, n1, n2);
        System.out.println(lca);
    }
}
