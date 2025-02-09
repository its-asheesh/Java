
import java.util.ArrayList;

public class Serialization {
    static final int empty = -1;

    static void serialize(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            arr.add(empty);
            return;
        }

        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }
}
