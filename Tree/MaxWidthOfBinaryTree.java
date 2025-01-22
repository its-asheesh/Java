import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBinaryTree {

    int maxWidth(TreeNode root){
        if(root == null){ 
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while(q.isEmpty() == false){
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}
