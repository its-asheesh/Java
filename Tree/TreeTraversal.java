
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    static void preorder(TreeNode root){
        if(root != null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(TreeNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }   

    static void levelorder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty() == false){
            TreeNode curr = q.poll();
            System.out.print(curr.key +" ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }

    static void levelorderLineByLine(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);

        while(q.size() > 1){
            TreeNode curr = q.poll();

            if(curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key +" ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            } 
        }
    }
}
