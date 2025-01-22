class Node {
    Node left;
    Node right;
    int key;

    Node(int r) {
        key = r;
        left = right = null;
    }
}

public class BuildBinaryTree {
    static int pre_index = 0;

    static Node cTree(int[] in, int[] pre, int is, int ie) {
        if (is > ie) {
            return null;
        }

        Node root = new Node(pre[pre_index++]);

        int in_index = 0;
        for (int i = is; i <= ie; i++) { 
            if (in[i] == root.key) {
                in_index = i;
                break;
            }
        }

        root.left = cTree(in, pre, is, in_index - 1);
        root.right = cTree(in, pre, in_index + 1, ie);

        return root;
    }

    static void printTree(Node root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.key + " "); 
        printTree(root.right);
    }

    public static void main(String[] args) {
        int[] in = {20, 10, 40, 30, 50};
        int[] pre = {10, 20, 30, 40, 50};
        int is = 0;
        int ie = in.length - 1; 

        Node root = cTree(in, pre, is, ie);
        System.out.println("Inorder Traversal of the Tree:");
        printTree(root);
    }
}
