
import java.util.ArrayList;


public class Tree {
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
        //root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(18);
        root.right.right.left = new TreeNode(22);
        root.right.right.right = new TreeNode(30);

        TreeTraversal t = new TreeTraversal();
        TreeHeight h = new TreeHeight();
        PrintNodeAtDistanceK pndk = new PrintNodeAtDistanceK();
        SizeOfBinaryTree sbt = new SizeOfBinaryTree();
        MaximumInBinaryTree mbt = new MaximumInBinaryTree();
        BalanceBinaryTree bbt = new BalanceBinaryTree();
        MaxWidthOfBinaryTree mwbt = new MaxWidthOfBinaryTree();
        PrintTreeInSpiralForm spiral = new PrintTreeInSpiralForm();
        FindLeastCommonAncestor2 lca2 = new FindLeastCommonAncestor2();
        CountNodes cn = new CountNodes();
        Serialization srl = new Serialization();

        // Perform and print Inorder Traversal
        System.out.print("Inorder Traversal: ");
        t.inorder(root);
        System.out.println();

        // Perform and print Preorder Traversal
        System.out.print("Preorder Traversal: ");
        t.preorder(root);
        System.out.println();

        // Perform and print Postorder Traversal
        System.out.print("Postorder Traversal: ");
        t.postorder(root);
        System.out.println();

        // Perfrom level order traversal
        System.out.print("Level order Traversal: ");
        t.levelorder(root);
        System.out.println();

        // Perfrom level order traversal line by line
        System.out.print("Level order Traversal: ");
        t.levelorderLineByLine(root);
        System.out.println();

        // Print tree in spiral form
        System.out.println("Tree in spiral form: ");
        spiral.printSpiralTree(root);
        System.out.println();
        
        // Calculate and print the height of the tree
        int treeHeight = h.height(root);
        System.out.println("Height of the Tree: " + treeHeight);

        // Print nodes at distance k
        int k = 2;
        System.out.print("Nodes at distance " + k + ": ");
        pndk.printKthNodes(root, k);
        System.out.println();

        // Find size of the tree
        int tree_size = sbt.getSize(root);
        System.out.print("Size of the tree : "+tree_size);
        System.out.println();

        //Find Max in binary tree
        int max_of_tree = mbt.getMax(root);
        System.out.print("Maximun in binary tree is : "+max_of_tree);
        System.out.println();

        //Check for balanced binary tree
        if(bbt.isBalanced(root) == -1){
          System.out.println("Tree is not balanced");
        }else{
          System.out.println("Tree is balanced.");
        }

        //Find the max width of binary tree
        int max_width = mwbt.maxWidth(root);
        System.out.println("Maximun width of the tree is : "+max_width);

        //Find the least common ancestor
        TreeNode lca = lca2.lca(root, 18, 9);
        System.out.println("LCA :"+lca);

        //Count the number of nodes in the tree
        int total_nodes = cn.countNodes(root);
        System.out.println("Total number of nodes in the binary tree : "+total_nodes);

        //Serialing the tree
        ArrayList<Integer> arr = new ArrayList<>();
        srl.serialize(root, arr);
        t.preorder(root);
    }
}

/*
                     10
                   /    \
                  5      20
                /  \    /   \
               3    8  15    25
              / \  / \ / \   / \
             2  4 7  9 12 18 22 30

 */