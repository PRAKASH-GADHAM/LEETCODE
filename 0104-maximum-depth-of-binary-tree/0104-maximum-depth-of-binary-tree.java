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
    int maxdepth = 0 ;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0 ;
        inOrder(root , 0) ;
        return maxdepth ;
    }
    public void inOrder(TreeNode node , int size){
        if(node == null) return ;
        size++ ;
        maxdepth = Math.max(maxdepth , size) ;
        inOrder(node.left , size) ;
        inOrder(node.right , size) ;
    }
}