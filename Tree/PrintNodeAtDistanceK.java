public class PrintNodeAtDistanceK {
    void printKthNodes(TreeNode root,int k){
        if(root == null){ 
            return;
        }
        if(k == 0){
            System.out.print(root.key+" ");
        }else{
            printKthNodes(root.left, k-1);
            printKthNodes(root.right, k-1);
        }
    }
}
