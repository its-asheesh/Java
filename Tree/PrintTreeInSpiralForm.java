
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintTreeInSpiralForm {
    static void printSpiralTree(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<Integer> s = new Stack<Integer>();
        boolean reverse = false;
        q.add(root);

        while(q.isEmpty() == false){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if(reverse){
                    s.push(curr.key);
                }else{
                    System.out.print(curr.key+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                } 
            }
            if(reverse){
                while(!(s.isEmpty())){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }
}
