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
class Solution {
    List<Integer> list ;
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root ;
        list = new ArrayList<>() ;
        if(current == null) return list ;
        inOrder(current , list) ;
        return list ;
    }

    public void inOrder(TreeNode node , List<Integer> list){
        if (node == null) return ;
        inOrder(node.left, list) ;
        list.add(node.val) ;
        inOrder(node.right, list) ;
    }
}