class TreeNode{
    int key;
    TreeNode left;
    TreeNode right;
    TreeNode(int k){
        key = k;
    }
    @Override
    public String toString() {
        return String.valueOf(key);
    }
}