import com.sun.source.tree.Tree;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root){
        return recursiveHelper(root.left, root.right);
    }

    public static boolean recursiveHelper (TreeNode q, TreeNode p){
        if(p == null && q == null){
            return true;
        }
        if((p == null || q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return recursiveHelper(q.left, p.right) && recursiveHelper(q.right, p.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        //TreeNode input = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        TreeNode input = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(input));
    }
}
