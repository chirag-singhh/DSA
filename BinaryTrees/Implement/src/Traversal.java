//public class Traversal {
//
//   // PREORDER TRAVERSAL
//    class Solution {
//        public void dfs(TreeNode root, ArrayList<Integer> ans) {
//            //  code here
//            if(root == null) return ;
//            ans.add(root.val);
//            dfs(root.left,ans);
//            dfs(root.right,ans);
//
//        }
//        public List<Integer> preorderTraversal(TreeNode root) {
//            ArrayList<Integer> ans = new ArrayList<>();
//            dfs(root,ans);
//            return ans;
//        }
//    }
//    //INORDER TRAVERSAL
//    class Solution {
//        public void dfs(TreeNode root, ArrayList<Integer> ans) {
//            //  code here
//            if(root == null) return ;
//
//            dfs(root.left,ans);
//            ans.add(root.val);
//            dfs(root.right,ans);
//
//        }
//        public List<Integer> inorderTraversal(TreeNode root) {
//            ArrayList<Integer> ans = new ArrayList<>();
//            dfs(root,ans);
//            return ans;
//        }
//    }
//
//    //POST ORDER
//    class Solution {
//
//        public void dfs(TreeNode root, ArrayList<Integer> ans) {
//            //  code here
//            if(root == null) return ;
//
//            dfs(root.left,ans);
//            dfs(root.right,ans);
//            ans.add(root.val);
//
//        }
//        public List<Integer> postorderTraversal(TreeNode root) {
//            ArrayList<Integer> ans = new ArrayList<>();
//            dfs(root,ans);
//            return ans;
//        }
//    }
//}
