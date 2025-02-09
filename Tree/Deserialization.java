
import java.util.ArrayList;

public class Deserialization {
    static final int empty = -1;
    static int index = 0;
    static TreeNode deserilize(ArrayList<Integer> arr){
        if(index == arr.size()){
            return null;
        }

        int val = arr.get(index);
        index++;
        if(val == empty){
            return null;
        }

        TreeNode root = new TreeNode(val);
        root.left = deserilize(arr);
        root.right = deserilize(arr);

        return root;
    }
}
