/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//class Solution {
//    private List<Integer> result = new ArrayList<>();
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        traversal(root);
//        return result;
//    }
//
//    private void traversal(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//
//        result.add(root.val);
//        traversal(root.left);
//        traversal(root.right);
//    }
//}

// Recursive
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

    }
}