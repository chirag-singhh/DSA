//public class Symmetric {
//    public boolean isIdentical(TreeNode r1, TreeNode r2) {
//        // code here
//        if(r1 == null && r2 == null) return true;
//        if(r1 == null || r2 == null) return false;
//        if(r1.val != r2.val) return false;
//        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
//
//    }
//    void mirror(TreeNode root) {
//        // code here
//        if(root == null) return;
//        TreeNode helper = root.left;
//        root.left = root.right;
//        root.right = helper;
//        mirror(root.left);
//        mirror(root.right);
//    }
//    public boolean isSymmetric(TreeNode root) {
//        mirror(root.left);
//        return  isIdentical(root.left,root.right);
//    }
//}
